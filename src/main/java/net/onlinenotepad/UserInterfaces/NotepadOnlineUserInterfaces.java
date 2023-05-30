package net.onlinenotepad.UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotepadOnlineUserInterfaces {

    public static final Target btnNotaEnriquecida = Target.the("Boton Nota Enriquecida ").located(By.xpath("//*[@id='richtextnote-tab' and contains(text(),'Nota de texto enriquecido')]"));
    public static final Target btnNuevaNota = Target.the("Boton Nota Enriquecida ").located(By.xpath("//*[@id='newNote']"));


}
