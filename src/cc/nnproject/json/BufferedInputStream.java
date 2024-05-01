package cc.nnproject.json;

import java.io.IOException;
import java.io.InputStream;

class BufferedInputStream extends InputStream {
	
	private InputStream in;
	private byte[] buf;
	private int pos;
	private int count;
	
	BufferedInputStream(InputStream stream) {
		in = stream;
		buf = new byte[2048];
	}

	public int read() throws IOException {
		if (pos >= count && fillbuf() == -1) return -1;
		if (count - pos > 0) return buf[pos++] & 0xFF;
		return -1;
	}

	public int read(byte[] b) throws IOException {
		return read(b, 0, b.length);
	}

	public int read(byte[] buffer, int offset, int length) throws IOException {
		if (length == 0) return 0;
		int required;
		if (pos < count) {
			int copylength = count - pos >= length ? length : count - pos;
			System.arraycopy(buf, pos, buffer, offset, copylength);
			pos += copylength;
			if (copylength == length || in.available() == 0)
				return copylength;
			offset += copylength;
			required = length - copylength;
		} else required = length;

		while (true) {
			int read;
			if (required >= buf.length) {
				read = in.read(buffer, offset, required);
				if (read == -1)
					return required == length ? -1 : length - required;
			} else {
				if (fillbuf() == -1)
					return required == length ? -1 : length - required;
				read = count - pos >= required ? required : count - pos;
				System.arraycopy(buf, pos, buffer, offset, read);
				pos += read;
			}
			required -= read;
			if (required == 0) return length;
			if (in.available() == 0) return length - required;
			offset += read;
		}
	}

	public long skip(long n) throws IOException {
		if (n < 1) return 0;

		if (count - pos >= n) {
			pos += n;
			return n;
		}
		long read = count - pos;
		pos = count;
		return read + in.skip(n - read);
	}

	public int available() throws IOException {
		return count - pos + in.available();
	}
	
	public void close() throws IOException {
		buf = null;
		in.close();
	}
	
	private int fillbuf() throws IOException {
		int r = in.read(buf);
		pos = 0;
		count = r == -1 ? 0 : r;
		return r;
	}

}