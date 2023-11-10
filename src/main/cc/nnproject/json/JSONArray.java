/*
Copyright (c) 2023 Arman Jussupgaliyev

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package cc.nnproject.json;

import java.util.Enumeration;
import java.util.Vector;

public class JSONArray extends AbstractJSON {

	private Vector vector;
	private boolean parsed;

	public JSONArray() {
		this.vector = new Vector();
	}

	public JSONArray(Vector vector) {
		this.vector = vector;
	}
	
	public Object get(int index) throws JSONException {
		try {
			if(index >= 0 && index < vector.size()) {
				Object o = JSON.getJSON(vector.elementAt(index));
				if (o instanceof JSONString)
					vector.setElementAt(o = JSON.parseJSON(o.toString()), index);
				else if (o == JSON.json_null)
					return null;
				return o;
			}
		} catch (Exception e) {
		}
		throw new JSONException("No value at " + index);
	}
	
	public Object get(int index, Object def) {
		try {
			return get(index);
		} catch (Exception e) {
			return def;
		}
	}
	
	public Object getNullable(int index) {
		return get(index, null);
	}
	
	public String getString(int index) throws JSONException {
		return String.valueOf(get(index));
	}
	
	public String getString(int index, String def) {
		try {
			return String.valueOf(get(index));
		} catch (Exception e) {
			return def;
		}
	}
	
	public String getNullableString(int index) {
		return getString(index, null);
	}
	
	public JSONObject getObject(int index) throws JSONException {
		try {
			return (JSONObject) get(index);
		} catch (ClassCastException e) {
			throw new JSONException("Not object at " + index);
		}
	}
	
	public JSONObject getObject(int index, JSONObject def) {
		try {
			return getObject(index);
		} catch (Exception e) {
		}
		return def;
	}
	
	public JSONObject getNullableObject(int index) {
		return getObject(index, null);
	}
	
	public JSONArray getArray(int index) throws JSONException {
		try {
			return (JSONArray) get(index);
		} catch (ClassCastException e) {
			throw new JSONException("Not array at " + index);
		}
	}
	
	public JSONArray getArray(int index, JSONArray def) {
		try {
			return getArray(index);
		} catch (Exception e) {
		}
		return def;
	}
	
	public JSONArray getNullableArray(int index) {
		return getArray(index, null);
	}
	
	public int getInt(int index) throws JSONException {
		return (int) JSON.getLong(get(index));
	}
	
	public int getInt(int index, int def) {
		try {
			return getInt(index);
		} catch (Exception e) {
			return def;
		}
	}
	
	public long getLong(int index) throws JSONException {
		return JSON.getLong(get(index));
	}

	public long getLong(int index, long def) {
		try {
			return getLong(index);
		} catch (Exception e) {
			return def;
		}
	}
	
	public double getDouble(int index) throws JSONException {
		return JSON.getDouble(get(index));
	}

	public double getDouble(int index, double def) {
		try {
			return getDouble(index);
		} catch (Exception e) {
			return def;
		}
	}
	
	public boolean getBoolean(int index) throws JSONException {
		Object o = get(index);
		if(o == JSON.TRUE) return true;
		if(o == JSON.FALSE) return false;
		if(o instanceof Boolean) return ((Boolean) o).booleanValue();
		if(o instanceof String) {
			String s = (String) o;
			s = s.toLowerCase();
			if(s.equals("true")) return true;
			if(s.equals("false")) return false;
		}
		throw new JSONException("Not boolean: " + o + " (" + index + ")");
	}

	public boolean getBoolean(int index, boolean def) {
		try {
			return getBoolean(index);
		} catch (Exception e) {
			return def;
		}
	}
	
	public boolean isNull(int index) {
		return JSON.isNull(get(index));
	}
	
	public void add(String s) {
		vector.addElement(JSON.getJSON(s));
	}

	public void add(boolean b) {
		vector.addElement(new Boolean(b));
	}

	public void add(double d) {
		vector.addElement(new Double(d));
	}
	
	public void add(int i) {
		vector.addElement(new Integer(i));
	}

	public void add(long l) {
		vector.addElement(new Long(l));
	}
	
	public void add(Object obj) {
		vector.addElement(JSON.getJSON(obj));
	}
	
	public void set(int idx, String s) {
		vector.setElementAt(JSON.getJSON(s), idx);
	}

	public void set(int idx, boolean b) {
		vector.setElementAt(new Boolean(b), idx);
	}

	public void set(int idx, double d) {
		vector.setElementAt(new Double(d), idx);
	}
	
	public void set(int idx, int i) {
		vector.setElementAt(new Integer(i), idx);
	}

	public void set(int idx, long l) {
		vector.setElementAt(new Long(l), idx);
	}
	
	public void set(int idx, Object obj) {
		vector.setElementAt(JSON.getJSON(obj), idx);
	}
	
	public void put(int idx, String s) {
		vector.insertElementAt(JSON.getJSON(s), idx);
	}

	public void put(int idx, boolean b) {
		vector.insertElementAt(new Boolean(b), idx);
	}

	public void put(int idx, double d) {
		vector.insertElementAt(new Double(d), idx);
	}
	
	public void put(int idx, int i) {
		vector.insertElementAt(new Integer(i), idx);
	}

	public void put(int idx, long l) {
		vector.insertElementAt(new Long(l), idx);
	}
	
	public void put(int idx, Object obj) {
		vector.insertElementAt(JSON.getJSON(obj), idx);
	}
	
	public void remove(int idx) {
		vector.removeElementAt(idx);
	}
	
	public void clear() {
		vector.removeAllElements();
	}
	
	public int size() {
		return vector.size();
	}
	
	public String toString() {
		return build();
	}
	
	public boolean equals(Object obj) {
		if(this == obj || super.equals(obj)) {
			return true;
		}
		return similar(obj);
	}
	
	public boolean similar(Object obj) {
        if(!(obj instanceof JSONArray)) {
            return false;
        }
        int size = size();
        if(size != ((JSONArray)obj).size()) {
        	return false;
        }
        for(int i = 0; i < size; i++) {
        	Object a = get(i);
        	Object b = ((JSONArray)obj).get(i);
        	if(a == b) {
        		continue;
        	}
        	if(a == null) {
        		return false;
        	}
        	if(a instanceof AbstractJSON) {
        		if (!((AbstractJSON)a).similar(b)) {
        			return false;
        		}
        	} else if(!a.equals(b)) {
        		return false;
        	}
        }
        return true;
	}

	public String build() {
		int size = size();
		if (size == 0)
			return "[]";
		StringBuffer s = new StringBuffer("[");
		int i = 0;
		while (i < size) {
			Object v = vector.elementAt(i);
			if (v instanceof AbstractJSON) {
				s.append(((AbstractJSON) v).build());
			} else if (v instanceof String) {
				s.append("\"").append(JSON.escape_utf8((String) v)).append("\"");
			} else if(JSON.json_null.equals(v)) {
				s.append((String) null);
			} else {
				s.append(String.valueOf(v));
			}
			i++;
			if (i < size) {
				s.append(",");
			}
		}
		s.append("]");
		return s.toString();
	}

	protected String format(int l) {
		int size = size();
		if (size == 0)
			return "[]";
		String t = "";
		for (int i = 0; i < l; i++) {
			t = t.concat(JSON.FORMAT_TAB);
		}
		String t2 = t.concat(JSON.FORMAT_TAB);
		StringBuffer s = new StringBuffer("[\n");
		s.append(t2);
		for (int i = 0; i < size; ) {
			Object v = null;
			try {
				v = get(i);
			} catch (JSONException e) {
			}
			if (v instanceof AbstractJSON) {
				s.append(((AbstractJSON) v).format(l + 1));
			} else if (v instanceof String) {
				s.append("\"").append(JSON.escape_utf8((String) v)).append("\"");
			} else if(v == JSON.json_null) {
				s.append((String) null);
			} else {
				s.append(v);
			}
			i++;
			if (i < size()) {
				s.append(",\n").append(t2);
			}
		}
		if (l > 0) {
			s.append("\n").append(t).append("]");
		} else {
			s.append("\n]");
		}
		return s.toString();
	}

	public Enumeration elements() {
		return new Enumeration() {
			int i = 0;
			public boolean hasMoreElements() {
				return i < vector.size();
			}
			public Object nextElement() {
				try {
					return get(i++);
				} catch (Exception e) {
					return null;
				}
			}
		};
	}
	
	public void copyInto(Object[] arr, int offset, int length) {
		int i = offset;
		int j = 0;
		while(i < arr.length && j < length && j < size()) {
			arr[i++] = get(j++);
		}
	}
	
	public boolean has(String s) {
		return vector.contains(s);
	}
	
	public boolean has(boolean b) {
		return vector.contains(new Boolean(b));
	}

	public boolean has(double d) {
		return vector.contains(new Double(d));
	}
	
	public boolean has(int i) {
		return vector.contains(new Integer(i));
	}

	public boolean has(long l) {
		return vector.contains(new Long(l));
	}
	
	public boolean has(Object o) {
		return vector.contains(JSON.getJSON(o));
	}
	
	public void parseTree() {
		if(parsed) return;
		parsed = true;
		int size = size();
		int i = 0;
		while (i < size) {
			Object v = vector.elementAt(i);
			if (v instanceof JSONObject) {
				((JSONObject) v).parseTree();
			} else if (v instanceof JSONArray) {
				((JSONArray) v).parseTree();
			} else if (v instanceof JSONString) {
				vector.setElementAt(v = JSON.parseJSON(v.toString()), i);
			}
			i++;
		}
	}
	
	public Vector getVector() {
		parseTree();
		return vector;
	}

	public Vector copy() {
		Vector copy = new Vector();
		int size = size();
		if (size == 0)
			return copy;
		int i = 0;
		while (i < size) {
			Object v = get(i);
			if (v instanceof JSONObject) {
				v = ((JSONObject) v).copy();
			} else if (v instanceof JSONArray) {
				v = ((JSONArray) v).copy();
			}
			copy.addElement(v);
			i++;
		}
		return copy;
	}

}
