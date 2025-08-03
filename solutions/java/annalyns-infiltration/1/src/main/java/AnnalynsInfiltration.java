class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false){
            return true;
        }
        if (!knightIsAwake && archerIsAwake && prisonerIsAwake){
            return true;
        }
        if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false) {
            return false;
        }
        return true;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(!archerIsAwake == !prisonerIsAwake) {
            return false;
        }
        if (archerIsAwake && !prisonerIsAwake) {
            return false;
        }
        return true;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (knightIsAwake == true && archerIsAwake == true && prisonerIsAwake == true && petDogIsPresent == false) {
            return false;
        }
        else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true) {
            return true;
        }
        else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent) {
            return true;
        }
        else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false) {
            return true;
        }
        else if (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true) {
            return true;
        }
        else if (knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true) {
            return true;
        }
        return false;
    }
}
