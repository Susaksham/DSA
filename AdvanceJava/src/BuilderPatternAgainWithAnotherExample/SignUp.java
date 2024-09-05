package BuilderPatternAgainWithAnotherExample;



class Run {

    public static void main(String...args){
        SignUp info = new SignUp.Builder("Saksham" , "Jain" , 91).setAddress("b-93").setPhone2(1).build();
        System.out.println(info.getFirstName());

    }

}
public class SignUp {

    private String firstName , lastName , address;
    private int phone1 , phone2;

    private SignUp(Builder details){
        this.firstName = details.firstName;
        this.lastName = details.lastName;
        this.address = details.address;
        this.phone1 = details.phone1;
        this.phone2 = details.phone2;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public static class Builder{
        private String firstName , lastName , address;
        private int phone1 , phone2;


        public Builder( String firstName , String lastName , int phone1){
            this.firstName = firstName;
            this.lastName = lastName;
            this.phone1 = phone1;
        }
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        public Builder setPhone2(int phone2){
            this.phone2 = phone2;
            return this;
        }
        public SignUp build(){
            SignUp obj = new SignUp(this);
            return obj;
        }


    }

}
