package com.lambton;


import org.json.JSONArray;
import org.json.JSONObject;

public class JSONHandling {
    public static void main(String[] args) {
        JSONObject jsonObject= new JSONObject();

        jsonObject.put("Sid",1);
        jsonObject.put("Name","Kuldeep");
        jsonObject.put("Marks",100);

        System.out.println(jsonObject);




        String userJson = "{\n" +

                "\"id\": 1,\n" +

                "\"name\": \"Leanne Graham\",\n" +

                "\"username\": \"Bret\",\n" +

                "\"email\": \"Sincere@april.biz\",\n" +

                "\"address\": {\n" +

                "\"street\": \"Kulas Light\",\n" +

                "\"suite\": \"Apt. 556\",\n" +

                "\"city\": \"Gwenborough\",\n" +

                "\"zipcode\": \"92998-3874\",\n" +

                "\"geo\": {\n" +

                "\"lat\": \"-37.3159\",\n" +

                "\"lng\": \"81.1496\"\n" +

                "}\n" +

                "},\n" +

                "\"phone\": \"1-770-736-8031 x56442\",\n" +

                "\"website\": \"hildegard.org\",\n" +

                "\"company\": {\n" +

                "\"name\": \"Romaguera-Crona\",\n" +

                "\"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +

                "\"bs\": \"harness real-time e-markets\"\n" +

                "}\n" +

                "}";


        //json object details
        JSONObject jobj= new JSONObject(userJson);

        System.out.println("ID  :" +jobj.getInt("id"));
        System.out.println("Name    :" + jobj.getString("name"));
        System.out.println("User Name   :" + jobj.getString("username"));
        System.out.println("Email   :" +jobj.getString("email"));

        //Address details
        JSONObject address= jobj.getJSONObject("address");
        System.out.println("Address  :" );

        System.out.println("Street  :"+ address.getString("street"));
        System.out.println("Suite   :" +address.getString("suite"));
        System.out.println("City   :" +address.getString("city"));
        System.out.println("Zip Code   :" +address.getString("zipcode"));


        //Geo location details
        JSONObject geo = address.getJSONObject("geo");
        System.out.println("Geo   :" );

        System.out.println("Latitude   :" +geo.getString("lat"));
        System.out.println("Longitude   :" +geo.getString("lng"));
        System.out.println("Phone Number   :" +jobj.getString("phone"));
        System.out.println("Website   :" +jobj.getString("website"));

        //company details
        JSONObject company=  jobj.getJSONObject("company");
        System.out.println("Company Name   :" +company.getString("name"));
        System.out.println("Catch Phrase    :" + company.getString("catchPhrase"));
        System.out.println("Business    :" + company.getString("bs"));




    }

}
