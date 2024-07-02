package pl.danwys.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import pl.danwys.model.Food;

import java.io.File;
import java.io.IOException;

public class WriteSingleObject {
    public static void main(String[] args) throws IOException {
        Food apple = new Food();
        apple.setName("apple");
        apple.setDescription("this is an apple");
        apple.setPrice("$0.59");
        apple.setCalories(112);

        ObjectMapper xmlMapper = new XmlMapper();

        // write to string
        String xml = xmlMapper.writeValueAsString(apple);
        System.out.println(xml);

        // write to file
        xmlMapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("src/main/resources/new-food-item.xml"), apple);

    }
}
