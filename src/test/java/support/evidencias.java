package support;

import definitions.Hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class evidencias {

    public static void captura() throws IOException {

        Date Date = new Date();
        SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy_HHmmss");

        String ruta="target/evidencias/"+fecha.format(Date)+"-evidencia.jpg";
        File file = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(ruta));
    }
}
