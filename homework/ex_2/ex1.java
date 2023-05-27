package homework;

import java.io.FileWriter;
import java.io.IOException;
import netscape.javascript.JSException;
import java.io.*;

import org.json.*;
/**
 * ex1
 */
public class ex1 {

    public static void main(String[] args) throws JSONException {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        JSONArray jsonArray = new JSONArray(jsonString);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject JSONObject = jsonArray.getJSONObject(i);
            stringBuilder.append("Студент").append(jsonObject.getString("Фамилия")).append("получил").append(jsonObject.getString("оценка")).append
            ("по предмету").appendjsonObject.getString("предмет").append(".n");
        }
        File outputFile = new File("output.txt");
        File logFile = new File("log.txt");
        try{
            FileWriter writer = new FileWriter(outputFile);
            writer.write(stringBuilder.toString());
            writer.close();
        }catch(IOException e){
            FileWriter logWriter = new FileWriter(logFile, true);
            logWriter.write("Ошибка:" + e.getMessage()+"n");
            logWriter.close();
        }
    }
}