public class AddContact {

    public String[] firstName = new String[1];
    private String[] lastName = new String[1];
    private int[] phoneNumber = new int[1];
    private int count = 0;
    private int sizeOfArrays = 1;

    public void addElements(String firstName, String lastName, int number){
       if(count == sizeOfArrays) {
           growSize();
       }
       this.firstName[count] = firstName;
       this.lastName[count] = lastName;
       this.phoneNumber[count] = number;
       count++;
    }

    public void growSize(){
        String tempFirstName[] = null;
        String tempLastName[] = null;
        int tempPhoneNumber[] = null;

        if(count == sizeOfArrays) {
            tempFirstName = new String[sizeOfArrays * 2];
            tempLastName = new String[sizeOfArrays * 2];
            tempPhoneNumber =  new int[sizeOfArrays * 2];

        }

        for (int i = 0 ; i < sizeOfArrays ; i++){
            tempFirstName[i] = firstName[i];
            tempLastName[i] = lastName[i];
            tempPhoneNumber[i] = phoneNumber[i];
        }

        firstName = tempFirstName;
        lastName = tempLastName;
        phoneNumber = tempPhoneNumber;

        sizeOfArrays = 2 * sizeOfArrays;

    }

}
