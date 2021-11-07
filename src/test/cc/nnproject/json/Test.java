package cc.nnproject.json;

public class Test {
	public static void main(String[] args) {
		try {
			long parse = System.currentTimeMillis();
			JSONObject j = JSON.getObject(data);
			parse = System.currentTimeMillis() - parse;
			long get1 = System.currentTimeMillis();
			System.out.println(j.getObject("response").getArray("items").getObject(1).getObject("photos").getInt("count"));
			get1 = System.currentTimeMillis() - get1;
			long get2 = System.currentTimeMillis();
			System.out.println(j.getObject("response").getArray("items").getObject(1).getObject("photos").getInt("count"));
			get2 = System.currentTimeMillis() - get2;
			long build = System.currentTimeMillis();
			System.out.println(j.build());
			build = System.currentTimeMillis() - build;
			long format = System.currentTimeMillis();
			System.out.println(j.format());
			format = System.currentTimeMillis() - format;
			System.out.println("parse_members: " + JSON.parse_members);
			System.out.println("build_functions: " + JSON.build_functions);
			System.out.println("parse: " + parse + "ms get1: " + get1 + "ms get2: " + get2 + "ms build: " + build + "ms format: " + format + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static final String data = "{\n" + 
			"\"response\": {\n" + 
			"\"items\": [{\n" + 
			"\"source_id\": -24565142,\n" + 
			"\"date\": 1601902200,\n" + 
			"\"can_doubt_category\": false,\n" + 
			"\"can_set_category\": false,\n" + 
			"\"topic_id\": 19,\n" + 
			"\"post_type\": \"post\",\n" + 
			"\"text\": \"«Сундрунские кекуры»\n" + 
			"\n" + 
			"Останцы в верхнем течении реки Сундрун, Якутия. Снимал А. Лавров: nat-geo.ru/community/user/193148\",\n" + 
			"\"marked_as_ads\": 0,\n" + 
			"\"attachments\": [{\n" + 
			"\"type\": \"photo\",\n" + 
			"\"photo\": {\n" + 
			"\"album_id\": -7,\n" + 
			"\"date\": 1601840378,\n" + 
			"\"id\": 457329521,\n" + 
			"\"owner_id\": -24565142,\n" + 
			"\"has_tags\": false,\n" + 
			"\"access_key\": \"cf0d95f95cdb1fac6f\",\n" + 
			"\"post_id\": 1568083,\n" + 
			"\"sizes\": [{\n" + 
			"\"height\": 87,\n" + 
			"\"url\": \"https://sun9-70.u...jJd5bevYn45e_5RZuOc\",\n" + 
			"\"type\": \"m\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 87,\n" + 
			"\"url\": \"https://sun9-70.u...jJd5bevYn45e_5RZuOc\",\n" + 
			"\"type\": \"o\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 133,\n" + 
			"\"url\": \"https://sun9-70.u...jEOQc7ddr1xeo_hi8Dg\",\n" + 
			"\"type\": \"p\",\n" + 
			"\"width\": 200\n" + 
			"}, {\n" + 
			"\"height\": 213,\n" + 
			"\"url\": \"https://sun9-70.u...DfcO6f0b-1wCeQUSwJI\",\n" + 
			"\"type\": \"q\",\n" + 
			"\"width\": 320\n" + 
			"}, {\n" + 
			"\"height\": 340,\n" + 
			"\"url\": \"https://sun9-70.u...G1VHLDcLCBmg9NNRRuU\",\n" + 
			"\"type\": \"r\",\n" + 
			"\"width\": 510\n" + 
			"}, {\n" + 
			"\"height\": 50,\n" + 
			"\"url\": \"https://sun9-70.u...KwcZDns6ohjSb0PXe5w\",\n" + 
			"\"type\": \"s\",\n" + 
			"\"width\": 75\n" + 
			"}, {\n" + 
			"\"height\": 1500,\n" + 
			"\"url\": \"https://sun9-70.u...GYS8GqUH5mf7fcsj6no\",\n" + 
			"\"type\": \"w\",\n" + 
			"\"width\": 2250\n" + 
			"}, {\n" + 
			"\"height\": 403,\n" + 
			"\"url\": \"https://sun9-70.u...b3YiOBwpMkQsWPy2WS4\",\n" + 
			"\"type\": \"x\",\n" + 
			"\"width\": 604\n" + 
			"}, {\n" + 
			"\"height\": 538,\n" + 
			"\"url\": \"https://sun9-70.u..._wGmT6yfGj5SRm04w2I\",\n" + 
			"\"type\": \"y\",\n" + 
			"\"width\": 807\n" + 
			"}, {\n" + 
			"\"height\": 853,\n" + 
			"\"url\": \"https://sun9-70.u...Kz0ke-G854LhYykG4VI\",\n" + 
			"\"type\": \"z\",\n" + 
			"\"width\": 1280\n" + 
			"}],\n" + 
			"\"text\": \"\",\n" + 
			"\"user_id\": 100\n" + 
			"}\n" + 
			"}],\n" + 
			"\"post_source\": {\n" + 
			"\"type\": \"vk\"\n" + 
			"},\n" + 
			"\"comments\": {\n" + 
			"\"count\": 0,\n" + 
			"\"can_post\": 1,\n" + 
			"\"groups_can_post\": true\n" + 
			"},\n" + 
			"\"likes\": {\n" + 
			"\"count\": 3,\n" + 
			"\"user_likes\": 0,\n" + 
			"\"can_like\": 1,\n" + 
			"\"can_publish\": 1\n" + 
			"},\n" + 
			"\"reposts\": {\n" + 
			"\"count\": 0,\n" + 
			"\"user_reposted\": 0\n" + 
			"},\n" + 
			"\"views\": {\n" + 
			"\"count\": 388\n" + 
			"},\n" + 
			"\"is_favorite\": false,\n" + 
			"\"donut\": {\n" + 
			"\"is_donut\": false\n" + 
			"},\n" + 
			"\"short_text_rate\": 0.8,\n" + 
			"\"post_id\": 1568083,\n" + 
			"\"type\": \"post\",\n" + 
			"\"push_subscription\": {\n" + 
			"\"is_subscribed\": false\n" + 
			"},\n" + 
			"\"track_code\": \"88ed6a78hqgoHukjGN4s5cEPvUrLI4wlm0osEy4XBEt5EsQ3vnn_xTt9ihUq6UzaJ786gvgd23TMKUJUfUxRHT4\"\n" + 
			"}, {\n" + 
			"\"source_id\": -24565142,\n" + 
			"\"date\": 1601902200,\n" + 
			"\"photos\": {\n" + 
			"\"count\": 4,\n" + 
			"\"items\": [{\n" + 
			"\"album_id\": -7,\n" + 
			"\"date\": 1601840378,\n" + 
			"\"id\": 457329521,\n" + 
			"\"owner_id\": -24565142,\n" + 
			"\"has_tags\": false,\n" + 
			"\"access_key\": \"cf0d95f95cdb1fac6f\",\n" + 
			"\"post_id\": 1568083,\n" + 
			"\"sizes\": [{\n" + 
			"\"height\": 87,\n" + 
			"\"url\": \"https://sun9-70.u...jJd5bevYn45e_5RZuOc\",\n" + 
			"\"type\": \"m\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 87,\n" + 
			"\"url\": \"https://sun9-70.u...jJd5bevYn45e_5RZuOc\",\n" + 
			"\"type\": \"o\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 133,\n" + 
			"\"url\": \"https://sun9-70.u...jEOQc7ddr1xeo_hi8Dg\",\n" + 
			"\"type\": \"p\",\n" + 
			"\"width\": 200\n" + 
			"}, {\n" + 
			"\"height\": 213,\n" + 
			"\"url\": \"https://sun9-70.u...DfcO6f0b-1wCeQUSwJI\",\n" + 
			"\"type\": \"q\",\n" + 
			"\"width\": 320\n" + 
			"}, {\n" + 
			"\"height\": 340,\n" + 
			"\"url\": \"https://sun9-70.u...G1VHLDcLCBmg9NNRRuU\",\n" + 
			"\"type\": \"r\",\n" + 
			"\"width\": 510\n" + 
			"}, {\n" + 
			"\"height\": 50,\n" + 
			"\"url\": \"https://sun9-70.u...KwcZDns6ohjSb0PXe5w\",\n" + 
			"\"type\": \"s\",\n" + 
			"\"width\": 75\n" + 
			"}, {\n" + 
			"\"height\": 1500,\n" + 
			"\"url\": \"https://sun9-70.u...GYS8GqUH5mf7fcsj6no\",\n" + 
			"\"type\": \"w\",\n" + 
			"\"width\": 2250\n" + 
			"}, {\n" + 
			"\"height\": 403,\n" + 
			"\"url\": \"https://sun9-70.u...b3YiOBwpMkQsWPy2WS4\",\n" + 
			"\"type\": \"x\",\n" + 
			"\"width\": 604\n" + 
			"}, {\n" + 
			"\"height\": 538,\n" + 
			"\"url\": \"https://sun9-70.u..._wGmT6yfGj5SRm04w2I\",\n" + 
			"\"type\": \"y\",\n" + 
			"\"width\": 807\n" + 
			"}, {\n" + 
			"\"height\": 853,\n" + 
			"\"url\": \"https://sun9-70.u...Kz0ke-G854LhYykG4VI\",\n" + 
			"\"type\": \"z\",\n" + 
			"\"width\": 1280\n" + 
			"}],\n" + 
			"\"text\": \"«Сундрунские кекуры»\n" + 
			"\n" + 
			"Останцы в верхнем течении реки Сундрун, Якутия. Снимал А. Лавров: nat-geo.ru/community/user/193148\",\n" + 
			"\"user_id\": 100,\n" + 
			"\"likes\": {\n" + 
			"\"user_likes\": 0,\n" + 
			"\"count\": 3\n" + 
			"},\n" + 
			"\"reposts\": {\n" + 
			"\"count\": 0,\n" + 
			"\"user_reposted\": 0\n" + 
			"},\n" + 
			"\"comments\": {\n" + 
			"\"count\": 0\n" + 
			"},\n" + 
			"\"can_comment\": 1,\n" + 
			"\"can_repost\": 1\n" + 
			"}, {\n" + 
			"\"album_id\": -7,\n" + 
			"\"date\": 1601840186,\n" + 
			"\"id\": 457329520,\n" + 
			"\"owner_id\": -24565142,\n" + 
			"\"has_tags\": false,\n" + 
			"\"access_key\": \"03f2c4bd4576596a5d\",\n" + 
			"\"post_id\": 1568014,\n" + 
			"\"sizes\": [{\n" + 
			"\"height\": 130,\n" + 
			"\"url\": \"https://sun9-52.u...pWGBwVpXQmzok1vWSfQ\",\n" + 
			"\"type\": \"m\",\n" + 
			"\"width\": 97\n" + 
			"}, {\n" + 
			"\"height\": 173,\n" + 
			"\"url\": \"https://sun9-52.u...hVZpVsO4U5WYEas6y4U\",\n" + 
			"\"type\": \"o\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 267,\n" + 
			"\"url\": \"https://sun9-52.u...Yt2ThHDJI_MiSU48U3c\",\n" + 
			"\"type\": \"p\",\n" + 
			"\"width\": 200\n" + 
			"}, {\n" + 
			"\"height\": 427,\n" + 
			"\"url\": \"https://sun9-52.u...unNYZ_W2r5iBG6CjFJY\",\n" + 
			"\"type\": \"q\",\n" + 
			"\"width\": 320\n" + 
			"}, {\n" + 
			"\"height\": 680,\n" + 
			"\"url\": \"https://sun9-52.u...ijmMeM8MglM2BLxp6ZQ\",\n" + 
			"\"type\": \"r\",\n" + 
			"\"width\": 510\n" + 
			"}, {\n" + 
			"\"height\": 75,\n" + 
			"\"url\": \"https://sun9-52.u...NjvfBgj639tHvnlpVwA\",\n" + 
			"\"type\": \"s\",\n" + 
			"\"width\": 56\n" + 
			"}, {\n" + 
			"\"height\": 1500,\n" + 
			"\"url\": \"https://sun9-52.u...X1rtmsPlJhSc9vXsjgc\",\n" + 
			"\"type\": \"w\",\n" + 
			"\"width\": 1125\n" + 
			"}, {\n" + 
			"\"height\": 604,\n" + 
			"\"url\": \"https://sun9-52.u...rXZlfF7QjERpgLlqej8\",\n" + 
			"\"type\": \"x\",\n" + 
			"\"width\": 453\n" + 
			"}, {\n" + 
			"\"height\": 807,\n" + 
			"\"url\": \"https://sun9-52.u...OgWobdIZUeaLiVqMFsI\",\n" + 
			"\"type\": \"y\",\n" + 
			"\"width\": 605\n" + 
			"}, {\n" + 
			"\"height\": 1080,\n" + 
			"\"url\": \"https://sun9-52.u...Kn3iWh8fdyoOduBPD-w\",\n" + 
			"\"type\": \"z\",\n" + 
			"\"width\": 810\n" + 
			"}],\n" + 
			"\"text\": \"Ахалтекинский жеребец в кадре Светланы Балабановой: nat-geo.ru/community/user/226592\",\n" + 
			"\"user_id\": 100,\n" + 
			"\"likes\": {\n" + 
			"\"user_likes\": 0,\n" + 
			"\"count\": 301\n" + 
			"},\n" + 
			"\"reposts\": {\n" + 
			"\"count\": 0,\n" + 
			"\"user_reposted\": 0\n" + 
			"},\n" + 
			"\"comments\": {\n" + 
			"\"count\": 18\n" + 
			"},\n" + 
			"\"can_comment\": 1,\n" + 
			"\"can_repost\": 1\n" + 
			"}, {\n" + 
			"\"album_id\": -7,\n" + 
			"\"date\": 1601840107,\n" + 
			"\"id\": 457329519,\n" + 
			"\"owner_id\": -24565142,\n" + 
			"\"has_tags\": false,\n" + 
			"\"access_key\": \"d981b005acb9eff012\",\n" + 
			"\"post_id\": 1567977,\n" + 
			"\"sizes\": [{\n" + 
			"\"height\": 87,\n" + 
			"\"url\": \"https://sun9-75.u...50szAcvmcSvX0AepK_8\",\n" + 
			"\"type\": \"m\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 87,\n" + 
			"\"url\": \"https://sun9-75.u...50szAcvmcSvX0AepK_8\",\n" + 
			"\"type\": \"o\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 134,\n" + 
			"\"url\": \"https://sun9-75.u...n_IpHuHu173MIE9YRIQ\",\n" + 
			"\"type\": \"p\",\n" + 
			"\"width\": 200\n" + 
			"}, {\n" + 
			"\"height\": 214,\n" + 
			"\"url\": \"https://sun9-75.u...uRE4nKA4zNVtoHCoRgU\",\n" + 
			"\"type\": \"q\",\n" + 
			"\"width\": 320\n" + 
			"}, {\n" + 
			"\"height\": 341,\n" + 
			"\"url\": \"https://sun9-75.u...N7xM9ZF1qODbLoTI-t4\",\n" + 
			"\"type\": \"r\",\n" + 
			"\"width\": 510\n" + 
			"}, {\n" + 
			"\"height\": 50,\n" + 
			"\"url\": \"https://sun9-75.u...xaMxuDeCq2psN-9-xC8\",\n" + 
			"\"type\": \"s\",\n" + 
			"\"width\": 75\n" + 
			"}, {\n" + 
			"\"height\": 1069,\n" + 
			"\"url\": \"https://sun9-75.u...to9-CGu4UbdLc-LOBug\",\n" + 
			"\"type\": \"w\",\n" + 
			"\"width\": 1600\n" + 
			"}, {\n" + 
			"\"height\": 403,\n" + 
			"\"url\": \"https://sun9-75.u...LcYucosPDvHwt36JGVg\",\n" + 
			"\"type\": \"x\",\n" + 
			"\"width\": 604\n" + 
			"}, {\n" + 
			"\"height\": 539,\n" + 
			"\"url\": \"https://sun9-75.u...Pxs5RGNRJtsrCTJH0gs\",\n" + 
			"\"type\": \"y\",\n" + 
			"\"width\": 807\n" + 
			"}, {\n" + 
			"\"height\": 855,\n" + 
			"\"url\": \"https://sun9-75.u...W5qLh_A7XzpjUIOB_44\",\n" + 
			"\"type\": \"z\",\n" + 
			"\"width\": 1280\n" + 
			"}],\n" + 
			"\"text\": \"Гаичка и мухомор в кадре Татьяны Спицыной: nat-geo.ru/community/user/14667\",\n" + 
			"\"user_id\": 100,\n" + 
			"\"likes\": {\n" + 
			"\"user_likes\": 0,\n" + 
			"\"count\": 483\n" + 
			"},\n" + 
			"\"reposts\": {\n" + 
			"\"count\": 1,\n" + 
			"\"user_reposted\": 0\n" + 
			"},\n" + 
			"\"comments\": {\n" + 
			"\"count\": 10\n" + 
			"},\n" + 
			"\"can_comment\": 1,\n" + 
			"\"can_repost\": 1\n" + 
			"}, {\n" + 
			"\"album_id\": -7,\n" + 
			"\"date\": 1601678069,\n" + 
			"\"id\": 457329353,\n" + 
			"\"owner_id\": -24565142,\n" + 
			"\"has_tags\": false,\n" + 
			"\"access_key\": \"dbafc230a2e7b0066b\",\n" + 
			"\"post_id\": 1567950,\n" + 
			"\"sizes\": [{\n" + 
			"\"height\": 97,\n" + 
			"\"url\": \"https://sun9-20.u...T2TWxqOyWvb29nNPjkc\",\n" + 
			"\"type\": \"m\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 97,\n" + 
			"\"url\": \"https://sun9-20.u...T2TWxqOyWvb29nNPjkc\",\n" + 
			"\"type\": \"o\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 149,\n" + 
			"\"url\": \"https://sun9-20.u...U-iMPlGtpl-dI8CmHZA\",\n" + 
			"\"type\": \"p\",\n" + 
			"\"width\": 200\n" + 
			"}, {\n" + 
			"\"height\": 239,\n" + 
			"\"url\": \"https://sun9-20.u...VBmxsqK3FQnOi0K4b-A\",\n" + 
			"\"type\": \"q\",\n" + 
			"\"width\": 320\n" + 
			"}, {\n" + 
			"\"height\": 381,\n" + 
			"\"url\": \"https://sun9-20.u...8eAs4KIR17xuLzynQr4\",\n" + 
			"\"type\": \"r\",\n" + 
			"\"width\": 510\n" + 
			"}, {\n" + 
			"\"height\": 56,\n" + 
			"\"url\": \"https://sun9-20.u...EwhIZCGWOdWJ1MDkbQE\",\n" + 
			"\"type\": \"s\",\n" + 
			"\"width\": 75\n" + 
			"}, {\n" + 
			"\"height\": 1500,\n" + 
			"\"url\": \"https://sun9-20.u...91uANG24qtyWy6OID8U\",\n" + 
			"\"type\": \"w\",\n" + 
			"\"width\": 2006\n" + 
			"}, {\n" + 
			"\"height\": 451,\n" + 
			"\"url\": \"https://sun9-20.u...BXkbmITr-Ak96fUOoKo\",\n" + 
			"\"type\": \"x\",\n" + 
			"\"width\": 604\n" + 
			"}, {\n" + 
			"\"height\": 603,\n" + 
			"\"url\": \"https://sun9-20.u...eVq-wbciNKNeUO8vjdA\",\n" + 
			"\"type\": \"y\",\n" + 
			"\"width\": 807\n" + 
			"}, {\n" + 
			"\"height\": 957,\n" + 
			"\"url\": \"https://sun9-20.u...e8zyXLpxwndjL2Xe71c\",\n" + 
			"\"type\": \"z\",\n" + 
			"\"width\": 1280\n" + 
			"}],\n" + 
			"\"text\": \"Улитка в лучах восходящего солнца. Снимал Пётр Катеринич: nat-geo.ru/community/user/227281\n" + 
			"\n" + 
			"Волшебного утра!\",\n" + 
			"\"user_id\": 100,\n" + 
			"\"likes\": {\n" + 
			"\"user_likes\": 0,\n" + 
			"\"count\": 292\n" + 
			"},\n" + 
			"\"reposts\": {\n" + 
			"\"count\": 1,\n" + 
			"\"user_reposted\": 0\n" + 
			"},\n" + 
			"\"comments\": {\n" + 
			"\"count\": 5\n" + 
			"},\n" + 
			"\"can_comment\": 1,\n" + 
			"\"can_repost\": 1\n" + 
			"}]\n" + 
			"},\n" + 
			"\"post_id\": 1601838000,\n" + 
			"\"ext_id\": \"-24565142_p457329521\",\n" + 
			"\"type\": \"wall_photo\",\n" + 
			"\"push_subscription\": {\n" + 
			"\"is_subscribed\": false\n" + 
			"}\n" + 
			"}, {\n" + 
			"\"source_id\": -37444923,\n" + 
			"\"date\": 1601901596,\n" + 
			"\"can_doubt_category\": false,\n" + 
			"\"can_set_category\": false,\n" + 
			"\"post_type\": \"post\",\n" + 
			"\"text\": \"Губернатор Евгений Куйвашев снова вводит ограничения в Свердловской области. Он запретил фан-зоны и танцполы на концертах, обязал закрывать детские игровые комнаты на выходные, ужесточил контроль за масками. Работодателям рекомендовано перевести часть сотрудников на удаленку.\",\n" + 
			"\"marked_as_ads\": 0,\n" + 
			"\"attachments\": [{\n" + 
			"\"type\": \"link\",\n" + 
			"\"link\": {\n" + 
			"\"url\": \"https://itsmycity...verdlovskoj-oblasti\",\n" + 
			"\"title\": \"В Свердловской области снова вводят ограничения по COVID-19. Они коснутся работодателей и организато\",\n" + 
			"\"caption\": \"itsmycity.ru\",\n" + 
			"\"description\": \"Губернатор Свердловской области Евгений Куйвашев подписал указ, вводящий некоторые ограничения по коронавирусу в регионе, а также рекомендовал работодателям перевести 30% сотрудников на удаленную работу. Указ опубликован портале правовой информации региона и вступит в силу завтра, 6 октября.\",\n" + 
			"\"photo\": {\n" + 
			"\"album_id\": -26,\n" + 
			"\"date\": 1601901596,\n" + 
			"\"id\": 457307907,\n" + 
			"\"owner_id\": 2000044109,\n" + 
			"\"has_tags\": false,\n" + 
			"\"sizes\": [{\n" + 
			"\"height\": 480,\n" + 
			"\"url\": \"https://sun9-30.u...iOC15jM6EYi5EFfK-hc\",\n" + 
			"\"type\": \"k\",\n" + 
			"\"width\": 800\n" + 
			"}, {\n" + 
			"\"height\": 240,\n" + 
			"\"url\": \"https://sun9-30.u...dgd6gDXx9MFdncvta2Y\",\n" + 
			"\"type\": \"l\",\n" + 
			"\"width\": 537\n" + 
			"}, {\n" + 
			"\"height\": 87,\n" + 
			"\"url\": \"https://sun9-30.u...MpnirzmXooVgZlWcNFM\",\n" + 
			"\"type\": \"m\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 174,\n" + 
			"\"url\": \"https://sun9-30.u...aM1YReclnK2XPkVJjmg\",\n" + 
			"\"type\": \"p\",\n" + 
			"\"width\": 260\n" + 
			"}, {\n" + 
			"\"height\": 50,\n" + 
			"\"url\": \"https://sun9-30.u...-PsCc1CXKx3-SvnBGZg\",\n" + 
			"\"type\": \"s\",\n" + 
			"\"width\": 75\n" + 
			"}, {\n" + 
			"\"height\": 100,\n" + 
			"\"url\": \"https://sun9-30.u...4lLHlCoNWUuUi2W4mrw\",\n" + 
			"\"type\": \"x\",\n" + 
			"\"width\": 150\n" + 
			"}],\n" + 
			"\"text\": \"\",\n" + 
			"\"user_id\": 100\n" + 
			"},\n" + 
			"\"amp\": {\n" + 
			"\"url\": \"https://itsmycity...verdlovskoj-oblasti\",\n" + 
			"\"views\": 5,\n" + 
			"\"is_favorite\": false,\n" + 
			"\"title\": \"\",\n" + 
			"\"caption\": \"\"\n" + 
			"},\n" + 
			"\"target\": \"internal\",\n" + 
			"\"is_favorite\": false\n" + 
			"}\n" + 
			"}],\n" + 
			"\"post_source\": {\n" + 
			"\"type\": \"vk\"\n" + 
			"},\n" + 
			"\"comments\": {\n" + 
			"\"count\": 0,\n" + 
			"\"can_post\": 1,\n" + 
			"\"groups_can_post\": true\n" + 
			"},\n" + 
			"\"likes\": {\n" + 
			"\"count\": 1,\n" + 
			"\"user_likes\": 0,\n" + 
			"\"can_like\": 1,\n" + 
			"\"can_publish\": 1\n" + 
			"},\n" + 
			"\"reposts\": {\n" + 
			"\"count\": 0,\n" + 
			"\"user_reposted\": 0\n" + 
			"},\n" + 
			"\"views\": {\n" + 
			"\"count\": 71\n" + 
			"},\n" + 
			"\"is_favorite\": false,\n" + 
			"\"donut\": {\n" + 
			"\"is_donut\": false\n" + 
			"},\n" + 
			"\"short_text_rate\": 0.8,\n" + 
			"\"post_id\": 46957,\n" + 
			"\"type\": \"post\",\n" + 
			"\"push_subscription\": {\n" + 
			"\"is_subscribed\": false\n" + 
			"},\n" + 
			"\"track_code\": \"d2ec21e0LTKS5Dh4MmTjMiP-hqL0528RXOrRMr8EMl3_rnrsHuNUX4HWXUtTU4VexU8Ca8XYMEYKi7p241Jg\"\n" + 
			"}, {\n" + 
			"\"source_id\": -60556804,\n" + 
			"\"date\": 1601901353,\n" + 
			"\"can_doubt_category\": false,\n" + 
			"\"can_set_category\": false,\n" + 
			"\"post_type\": \"post\",\n" + 
			"\"text\": \"Новый антирекорд поставил Петербург по заболевшим коронавирусом.\n" + 
			"\n" + 
			"За минувшие сутки в городе зафиксировали более четырехсот новых случаев.\n" + 
			"\n" + 
			"Подробнее:\n" + 
			"https://echo.msk.ru/news/2720289-echo.html\",\n" + 
			"\"marked_as_ads\": 0,\n" + 
			"\"attachments\": [{\n" + 
			"\"type\": \"link\",\n" + 
			"\"link\": {\n" + 
			"\"url\": \"https://echo.msk....s/2720289-echo.html\",\n" + 
			"\"title\": \"Новый антирекорд поставил Петербург по заболевшим коронавирусом\",\n" + 
			"\"caption\": \"echo.msk.ru\",\n" + 
			"\"description\": \"За минувшие сутки в городе зафиксировали более четырехсот новых случаев…\",\n" + 
			"\"photo\": {\n" + 
			"\"album_id\": -26,\n" + 
			"\"date\": 1601901357,\n" + 
			"\"id\": 457312588,\n" + 
			"\"owner_id\": 2000043633,\n" + 
			"\"has_tags\": false,\n" + 
			"\"sizes\": [{\n" + 
			"\"height\": 480,\n" + 
			"\"url\": \"https://sun9-74.u...Ng4eVFV5Bmt4HbpC1Bg\",\n" + 
			"\"type\": \"k\",\n" + 
			"\"width\": 1074\n" + 
			"}, {\n" + 
			"\"height\": 240,\n" + 
			"\"url\": \"https://sun9-74.u...kW6mvfOSZlclljzD3OM\",\n" + 
			"\"type\": \"l\",\n" + 
			"\"width\": 537\n" + 
			"}, {\n" + 
			"\"height\": 73,\n" + 
			"\"url\": \"https://sun9-74.u...o48METGdLj86AKzuXWU\",\n" + 
			"\"type\": \"m\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 146,\n" + 
			"\"url\": \"https://sun9-74.u...DhbQG8zVhcZnTjpPZQQ\",\n" + 
			"\"type\": \"p\",\n" + 
			"\"width\": 260\n" + 
			"}, {\n" + 
			"\"height\": 42,\n" + 
			"\"url\": \"https://sun9-74.u...DzMnuVsfof6rnLVlUnE\",\n" + 
			"\"type\": \"s\",\n" + 
			"\"width\": 75\n" + 
			"}, {\n" + 
			"\"height\": 84,\n" + 
			"\"url\": \"https://sun9-74.u...C_KgunmL6sEhXnGqG2I\",\n" + 
			"\"type\": \"x\",\n" + 
			"\"width\": 150\n" + 
			"}],\n" + 
			"\"text\": \"\",\n" + 
			"\"user_id\": 100\n" + 
			"},\n" + 
			"\"amp\": {\n" + 
			"\"url\": \"https://echo-msk-...s/2720289-echo.html\",\n" + 
			"\"views\": 8,\n" + 
			"\"is_favorite\": false,\n" + 
			"\"title\": \"\",\n" + 
			"\"caption\": \"\"\n" + 
			"},\n" + 
			"\"target\": \"internal\",\n" + 
			"\"is_favorite\": false\n" + 
			"}\n" + 
			"}],\n" + 
			"\"post_source\": {\n" + 
			"\"type\": \"api\"\n" + 
			"},\n" + 
			"\"comments\": {\n" + 
			"\"count\": 1,\n" + 
			"\"can_post\": 1,\n" + 
			"\"groups_can_post\": true\n" + 
			"},\n" + 
			"\"likes\": {\n" + 
			"\"count\": 4,\n" + 
			"\"user_likes\": 0,\n" + 
			"\"can_like\": 1,\n" + 
			"\"can_publish\": 1\n" + 
			"},\n" + 
			"\"reposts\": {\n" + 
			"\"count\": 0,\n" + 
			"\"user_reposted\": 0\n" + 
			"},\n" + 
			"\"views\": {\n" + 
			"\"count\": 774\n" + 
			"},\n" + 
			"\"is_favorite\": false,\n" + 
			"\"donut\": {\n" + 
			"\"is_donut\": false\n" + 
			"},\n" + 
			"\"short_text_rate\": 0.8,\n" + 
			"\"post_id\": 4127795,\n" + 
			"\"type\": \"post\",\n" + 
			"\"push_subscription\": {\n" + 
			"\"is_subscribed\": false\n" + 
			"},\n" + 
			"\"track_code\": \"6c599907D3TlWa3tOvGOqt0SnO_TsEImXwgX6SlCn4qFx7j6ifl2GaFhlIkNwruRO6YfJ-ONHHMOa3yqfhbN3cQ\"\n" + 
			"}, {\n" + 
			"\"source_id\": -33393308,\n" + 
			"\"date\": 1601901313,\n" + 
			"\"can_doubt_category\": false,\n" + 
			"\"can_set_category\": false,\n" + 
			"\"post_type\": \"post\",\n" + 
			"\"text\": \"26–27 октября hh.ru проводит онлайн-саммит — HR Digital 2020: vc.ru/162535\n" + 
			"\n" + 
			"Ключевые темы в этом году: антикризисные стратегии в управлении персоналом, HR-аналитика, мотивация и адаптация персонала, HR-решения для малого бизнеса. Стоимость участия — от 15 тысяч рублей\n" + 
			"\n" + 
			"#мероприятия\",\n" + 
			"\"marked_as_ads\": 0,\n" + 
			"\"attachments\": [{\n" + 
			"\"type\": \"photo\",\n" + 
			"\"photo\": {\n" + 
			"\"album_id\": -7,\n" + 
			"\"date\": 1601901313,\n" + 
			"\"id\": 457269658,\n" + 
			"\"owner_id\": -33393308,\n" + 
			"\"has_tags\": false,\n" + 
			"\"access_key\": \"a4e8258e5f9912f041\",\n" + 
			"\"post_id\": 676827,\n" + 
			"\"sizes\": [{\n" + 
			"\"height\": 83,\n" + 
			"\"url\": \"https://sun9-74.u...5cSmKyaVbjKFXKBD7OM\",\n" + 
			"\"type\": \"m\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 87,\n" + 
			"\"url\": \"https://sun9-74.u...fGNvCJuesL-F8nv9qQg\",\n" + 
			"\"type\": \"o\",\n" + 
			"\"width\": 130\n" + 
			"}, {\n" + 
			"\"height\": 133,\n" + 
			"\"url\": \"https://sun9-74.u...OhDu-B5Nl5IW9LKQShE\",\n" + 
			"\"type\": \"p\",\n" + 
			"\"width\": 200\n" + 
			"}, {\n" + 
			"\"height\": 213,\n" + 
			"\"url\": \"https://sun9-74.u...OQHTh1rn_lTnW7g5U00\",\n" + 
			"\"type\": \"q\",\n" + 
			"\"width\": 320\n" + 
			"}, {\n" + 
			"\"height\": 340,\n" + 
			"\"url\": \"https://sun9-74.u...jSjQ8yLBiIjORzlAkRI\",\n" + 
			"\"type\": \"r\",\n" + 
			"\"width\": 510\n" + 
			"}, {\n" + 
			"\"height\": 48,\n" + 
			"\"url\": \"https://sun9-74.u...cFs0nsIh-a4FluZTrQk\",\n" + 
			"\"type\": \"s\",\n" + 
			"\"width\": 75\n" + 
			"}, {\n" + 
			"\"height\": 1277,\n" + 
			"\"url\": \"https://sun9-74.u...1TZzT-vHPlJU9nXHI48\",\n" + 
			"\"type\": \"w\",\n" + 
			"\"width\": 2000\n" + 
			"}, {\n" + 
			"\"height\": 385,\n" + 
			"\"url\": \"https://sun9-74.u...yVewNcEQJ2FTAK1T-MU\",\n" + 
			"\"type\": \"x\",\n" + 
			"\"width\": 604\n" + 
			"}, {\n" + 
			"\"height\": 515,\n" + 
			"\"url\": \"https://sun9-74.u...hbXwlgP9PXzWPNqaGM8\",\n" + 
			"\"type\": \"y\",\n" + 
			"\"width\": 807\n" + 
			"}, {\n" + 
			"\"height\": 817,\n" + 
			"\"url\": \"https://sun9-74.u...Qej7NlVSxqFHQv33Jzk\",\n" + 
			"\"type\": \"z\",\n" + 
			"\"width\": 1280\n" + 
			"}],\n" + 
			"\"text\": \"26–27 октября hh.ru проводит онлайн-саммит — HR Digital 2020: vc.ru/162535\n" + 
			"\n" + 
			"Ключевые темы в этом году: антикризисные стратегии в управлении персоналом, HR-аналитика, мотивация и адаптация персонала, HR-решения для малого бизнеса. Стоимость участия — от 15 тысяч рублей\n" + 
			"\n" + 
			"#мероприятия\",\n" + 
			"\"user_id\": 100\n" + 
			"}\n" + 
			"}],\n" + 
			"\"post_source\": {\n" + 
			"\"type\": \"api\"\n" + 
			"},\n" + 
			"\"comments\": {\n" + 
			"\"count\": 0,\n" + 
			"\"can_post\": 1,\n" + 
			"\"groups_can_post\": true\n" + 
			"},\n" + 
			"\"likes\": {\n" + 
			"\"count\": 4,\n" + 
			"\"user_likes\": 0,\n" + 
			"\"can_like\": 1,\n" + 
			"\"can_publish\": 1\n" + 
			"},\n" + 
			"\"reposts\": {\n" + 
			"\"count\": 0,\n" + 
			"\"user_reposted\": 0\n" + 
			"},\n" + 
			"\"views\": {\n" + 
			"\"count\": 2878\n" + 
			"},\n" + 
			"\"is_favorite\": false,\n" + 
			"\"donut\": {\n" + 
			"\"is_donut\": false\n" + 
			"},\n" + 
			"\"short_text_rate\": 0.8,\n" + 
			"\"post_id\": 676827,\n" + 
			"\"type\": \"post\",\n" + 
			"\"push_subscription\": {\n" + 
			"\"is_subscribed\": false\n" + 
			"},\n" + 
			"\"track_code\": \"0f2068fbdN5dDyAZC0URwaC76JuBJTHe6ZSuKPtEr2h8WQO32hoNs0psFXw4JiSsRgpoVb0dZIu09sdtqB_4MQ\"\n" + 
			"}],\n" + 
			"\"profiles\": [{\n" + 
			"\"id\": 100,\n" + 
			"\"first_name\": \"VK Administration\",\n" + 
			"\"last_name\": \"\",\n" + 
			"\"is_closed\": false,\n" + 
			"\"can_access_closed\": true,\n" + 
			"\"is_service\": true,\n" + 
			"\"sex\": 2,\n" + 
			"\"screen_name\": \"id100\",\n" + 
			"\"photo_50\": \"https://sun9-55.u...wzBfES0HE&ava=1\",\n" + 
			"\"photo_100\": \"https://sun9-55.u...ef2P3L2M8&ava=1\",\n" + 
			"\"online\": 0,\n" + 
			"\"online_info\": {\n" + 
			"\"visible\": true,\n" + 
			"\"is_online\": false,\n" + 
			"\"is_mobile\": false\n" + 
			"}\n" + 
			"}],\n" + 
			"\"groups\": [{\n" + 
			"\"id\": 24565142,\n" + 
			"\"name\": \"Клуб National Geographic Россия\",\n" + 
			"\"screen_name\": \"natgeoru\",\n" + 
			"\"is_closed\": 0,\n" + 
			"\"type\": \"page\",\n" + 
			"\"is_admin\": 0,\n" + 
			"\"is_member\": 1,\n" + 
			"\"is_advertiser\": 0,\n" + 
			"\"photo_50\": \"https://sun9-11.u..._eaor5u9s&ava=1\",\n" + 
			"\"photo_100\": \"https://sun9-11.u...ZB_etFEqc&ava=1\",\n" + 
			"\"photo_200\": \"https://sun9-11.u...kKH6Qr2So&ava=1\"\n" + 
			"}, {\n" + 
			"\"id\": 33393308,\n" + 
			"\"name\": \"Стартапы и бизнес\",\n" + 
			"\"screen_name\": \"vcru\",\n" + 
			"\"is_closed\": 0,\n" + 
			"\"type\": \"page\",\n" + 
			"\"is_admin\": 0,\n" + 
			"\"is_member\": 1,\n" + 
			"\"is_advertiser\": 0,\n" + 
			"\"photo_50\": \"https://sun9-75.u...nXWmQ8qiQ&ava=1\",\n" + 
			"\"photo_100\": \"https://sun9-75.u...BmaR9Ebv4&ava=1\",\n" + 
			"\"photo_200\": \"https://sun9-75.u...m1izjhsQo&ava=1\"\n" + 
			"}, {\n" + 
			"\"id\": 37444923,\n" + 
			"\"name\": \"It's My City. Екатеринбург\",\n" + 
			"\"screen_name\": \"itsmycityekb\",\n" + 
			"\"is_closed\": 0,\n" + 
			"\"type\": \"page\",\n" + 
			"\"is_admin\": 0,\n" + 
			"\"is_member\": 1,\n" + 
			"\"is_advertiser\": 0,\n" + 
			"\"photo_50\": \"https://sun9-75.u...6V4vUQbfU&ava=1\",\n" + 
			"\"photo_100\": \"https://sun9-75.u...aCycFa970&ava=1\",\n" + 
			"\"photo_200\": \"https://sun9-75.u...tBm6OjCeg&ava=1\"\n" + 
			"}, {\n" + 
			"\"id\": 60556804,\n" + 
			"\"name\": \"Эхо Москвы\",\n" + 
			"\"screen_name\": \"echomsk\",\n" + 
			"\"is_closed\": 0,\n" + 
			"\"type\": \"page\",\n" + 
			"\"is_admin\": 0,\n" + 
			"\"is_member\": 1,\n" + 
			"\"is_advertiser\": 0,\n" + 
			"\"photo_50\": \"https://sun9-18.u...xBULLN0CY&ava=1\",\n" + 
			"\"photo_100\": \"https://sun9-18.u...xRRNAaRp0&ava=1\",\n" + 
			"\"photo_200\": \"https://sun9-18.u...btgVUCgww&ava=1\"\n" + 
			"}],\n" + 
			"\"next_from\": \"5/5_-33393308_676827:1605157195:5\"\n" + 
			"}\n" + 
			"}";

}
