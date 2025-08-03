class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake && !archerIsAwake && !prisonerIsAwake){
            return true;
        }
        if (!knightIsAwake && archerIsAwake && prisonerIsAwake){
            return true;
        }
        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
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
        return !(knightIsAwake && archerIsAwake && prisonerIsAwake && !petDogIsPresent)
            && (!knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent)
            || (!knightIsAwake && !archerIsAwake && prisonerIsAwake && petDogIsPresent)
            || (!knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent)
            || (knightIsAwake && !archerIsAwake && !prisonerIsAwake && petDogIsPresent)
            || (knightIsAwake && !archerIsAwake && prisonerIsAwake && petDogIsPresent); 
    }
}
