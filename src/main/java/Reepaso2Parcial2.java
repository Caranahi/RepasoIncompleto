

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Reepaso2Parcial2 {

    public static void main(String[] args) throws IOException {

        File file = new File("generated.json");

 ObjectMapper mapper = new ObjectMapper();
        Persona p = mapper.readValue(file, Persona.class);
        System.out.println(p);
    }
}
