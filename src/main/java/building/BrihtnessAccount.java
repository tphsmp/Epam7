package building;

public interface BrihtnessAccount extends CommonLampsBrightness, CoomonWindowsBrigthness {

    //рассчитываем общую яркость

    default int commonBrightness() {

        return calcWindowsBrightness() + calcLampsBrigthness();

    }

}


