package bjs.task17;

import bjs.task17.computers.Desktop;
import bjs.task17.computerstore.ComputerStore;

public class Main {
    public static void main(String[] args) {
        ComputerStore computerStore = new ComputerStore();

        Desktop computer = new Desktop();
        computer.setComputerType("Base game PC");
        computer.setProcessor("Intel Core i3-6100", 3.7, 3);
        computer.setRandomAccessMemory("DDR3-1600", 8);
        computer.setStorage("HDD", 1000, "7200 rpm");
        computer.setMotherboard("Intel H110/B150 (LGA1151)");
        computer.setVideoCard("NVIDIA GeForce GTX 750 Ti", 2, "GDDR5");
        computer.setDisplay("23″, IPS matrix, DVI/HDMI");
        computer.setChassis("Middle Tower ATX, 450 W");
        computer.setAudioCard("Realtek HD Audio");
        //Accessories
        computer.setKeyboard("Logitech G410 Atlas Spectrum");
        computer.setMouse("Lenovo Y Gaming Precision Mouse");
        computer.setWebcam("Logitech HD Webcam C270");
        computer.setHeadset("Lenovo Y Gaming Surround Sound Headset");
        computer.setAudioSystem("Logitech Speaker System Z320 ");
        computer.setPrice(710);

        computerStore.addDesktop(computer);

        computer = new Desktop();
        computer.setComputerType("Optimal game PC");
        computer.setProcessor("Intel Core i5-6500", 3.6, 6);
        computer.setRandomAccessMemory("DDR3-1866", 8);
        computer.setStorage("HDD", 2000, "7200 rpm");
        computer.setMotherboard("Intel B150/H170 (LGA1151)");
        computer.setVideoCard("AMD Radeon R9 380", 2, "GDDR5");
        computer.setDisplay("23″, матрица IPS/e-IPS/PLS, DVI");
        computer.setChassis("Middle Tower ATX, 500 W");
        computer.setAudioCard("Realtek HD Audio");
        //Accessories
        computer.setKeyboard("Logitech G410 Atlas Spectrum");
        computer.setMouse("Lenovo Y Gaming Precision Mouse");
        computer.setWebcam("Logitech HD Webcam C310");
        computer.setHeadset("Lenovo Y Gaming Surround Sound Headset");
        computer.setAudioSystem("Logitech Speaker System Z320 ");
        computer.setPrice(1110);

        computerStore.addDesktop(computer);

        computer = new Desktop();
        computer.setComputerType("Advanced game PC");
        computer.setProcessor("Intel Core i5-6600K", 3.9, 6);
        computer.setRandomAccessMemory("DDR3-2133", 16);
        computer.setStorage("HDD", 2000, "7200 rpm");
        computer.setMotherboard("Intel Z170 (LGA1151)");
        computer.setVideoCard("NVIDIA GeForce GTX 970", 4, "GDDR5");
        computer.setDisplay("23-27″, матрица IPS/PLS, DVI/HDMI/DisplayPort");
        computer.setChassis("Middle Tower ATX, 650 W");
        computer.setAudioCard("Realtek HD Audio");
        //Accessories
        computer.setKeyboard("Logitech G410 Atlas Spectrum");
        computer.setMouse("Lenovo Y Gaming Precision Mouse");
        computer.setWebcam("Logitech HD Webcam C930e");
        computer.setHeadset("Lenovo Y Gaming Surround Sound Headset");
        computer.setAudioSystem("Logitech Speaker System Z320 ");
        computer.setPrice(1695);

        computerStore.addDesktop(computer);

        //computerStore.printDesktopComputersIndex();
        //computerStore.printDesktopComputersIterator();
        computerStore.printDesktopComputersForEach();
    }
}

/*
Base game PC
Processor: Intel Core i3-6100, 3.7 GHz, 3.0 Mb
RAM: 8.0 Gb, DDR3-1600
HDD, 1000.0 Gb, 7200 rpm
NVIDIA GeForce GTX 750 Ti, 2.0 Gb, GDDR5
Display: 23″, IPS matrix, DVI/HDMI
Chassis: Middle Tower ATX, 450 W
Audio card: Realtek HD Audio
Accessories:
	Logitech G410 Atlas Spectrum
	Lenovo Y Gaming Precision Mouse
	Logitech HD Webcam C270
	Lenovo Y Gaming Surround Sound Headset
	Logitech Speaker System Z320

Price:  710.0
--------------------------------------------

Optimal game PC
Processor: Intel Core i5-6500, 3.6 GHz, 6.0 Mb
RAM: 8.0 Gb, DDR3-1866
HDD, 2000.0 Gb, 7200 rpm
AMD Radeon R9 380, 2.0 Gb, GDDR5
Display: 23″, матрица IPS/e-IPS/PLS, DVI
Chassis: Middle Tower ATX, 500 W
Audio card: Realtek HD Audio
Accessories:
	Logitech G410 Atlas Spectrum
	Lenovo Y Gaming Precision Mouse
	Logitech HD Webcam C310
	Lenovo Y Gaming Surround Sound Headset
	Logitech Speaker System Z320

Price:  1110.0
--------------------------------------------

Advanced game PC
Processor: Intel Core i5-6600K, 3.9 GHz, 6.0 Mb
RAM: 16.0 Gb, DDR3-2133
HDD, 2000.0 Gb, 7200 rpm
NVIDIA GeForce GTX 970, 4.0 Gb, GDDR5
Display: 23-27″, матрица IPS/PLS, DVI/HDMI/DisplayPort
Chassis: Middle Tower ATX, 650 W
Audio card: Realtek HD Audio
Accessories:
	Logitech G410 Atlas Spectrum
	Lenovo Y Gaming Precision Mouse
	Logitech HD Webcam C930e
	Lenovo Y Gaming Surround Sound Headset
	Logitech Speaker System Z320

Price:  1695.0
--------------------------------------------
 */
