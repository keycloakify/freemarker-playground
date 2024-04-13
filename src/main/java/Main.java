
import freemarker.template.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Configure FreeMarker
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
        try {
            cfg.setDirectoryForTemplateLoading(new File("src/main/resources"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            cfg.setLogTemplateExceptions(false);

            // Data-model creation
            Map<String, Object> root = new HashMap<>();
            root.put("message", "Hello World!");

            // Get template
            Template temp = cfg.getTemplate("test.ftl");

            // Merge data-model with template
            Writer out = new OutputStreamWriter(System.out);
            temp.process(root, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

