public class ZombiePlant {
    //properties
    private int maxPotency;
    private int successfulTreatments;

    //constructors


    public ZombiePlant(){
        maxPotency = 0;
        successfulTreatments = 0;
    }

    public ZombiePlant(int userPotency, int userSucessfultreatments){
        maxPotency = userPotency;
        successfulTreatments = userSucessfultreatments;
    }

    //methods
    public int treatmentsNeeded(){
        return successfulTreatments;
    }

    public int getPotencyRequired(){
        return maxPotency;
    }

    public boolean isDangerous(){
        if (successfulTreatments ==0){
            return false;
        }
        return true;

    }

    public void treat(int userNum){
        if(isDangerous()==true){
           if (userNum <= maxPotency && userNum>0){
               successfulTreatments = successfulTreatments-1;
           }
            if (userNum>maxPotency){
                successfulTreatments+=1;
            }
       } else if (isDangerous()==false) {
            if (userNum>maxPotency){
                successfulTreatments+=1;
            }        }


    }

}
