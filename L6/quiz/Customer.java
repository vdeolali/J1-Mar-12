class Customer
{
     String firstName;
     String lastName;

    public String concatName()
    {
        String strResult = lastName + ", " + firstName;
        return strResult;
    }
}