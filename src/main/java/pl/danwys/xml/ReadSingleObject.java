package pl.danwys.xml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import pl.danwys.model.Food;

import java.io.File;
import java.io.IOException;

public class ReadSingleObject {
    public static void main(String[] args) throws IOException {
        ObjectMapper xmlMapper = new XmlMapper();

        Food foodItem = xmlMapper.readValue(new File("src/main/resources/food-item.xml"), Food.class);
        System.out.println(foodItem);
    }
}
