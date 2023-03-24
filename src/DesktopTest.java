import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesktopTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Desktop desktop = new Desktop("AMD Ryzen 7", new PlacaVideo("Nvidia", "RTX 3050", "8GB"), "16GB", "A520M", "SSD 240GB", "500W");

        Desktop desktopClone = desktop.clone();
        desktopClone.setProcessador("AMD Ryzen 5");
        desktopClone.setMemoriaRAM("16GB Clonada");
        desktopClone.getPlacaVideo().setMemoria("4GB");


        assertEquals("Desktop{processador='AMD Ryzen 7', placaVideo=PlacaVideo{marca='Nvidia', modelo='RTX 3050', memoria='8GB'}, memoriaRAM='16GB', placaMae='A520M', armazenamento='SSD 240GB', fonte='500W'}", desktop.toString());
        assertEquals("Desktop{processador='AMD Ryzen 5', placaVideo=PlacaVideo{marca='Nvidia', modelo='RTX 3050', memoria='4GB'}, memoriaRAM='16GB Clonada', placaMae='A520M', armazenamento='SSD 240GB', fonte='500W'}", desktopClone.toString());
    }


}