import java.awt.event.PaintEvent;
import java.time.LocalDate;

public class Person
{
    protected int id;
    protected String FirstName;
    protected String LastName;
    protected Sex sex;
    protected LocalDate birthdate;



    public String toString()
    {
        return  "\n Person:" +
                "\n Id:" + id +
                "\n First name:" + FirstName +
                "\n Last name:" + LastName +
                "\n sex:" + sex +
                "\n birthDate:" + birthdate;
    }

    public boolean equals (Person person)
    {
        return this.id == person.id;
    }

    public int hashCode()
    {
        return id;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }



    public String getFirstName()
    {
        return FirstName;
    }

    public void setFirstName(String name)
    {
        this.FirstName = name;
    }

    public String getLastName()
    {
        return FirstName;
    }

    public void setLastName(String name)
    {
        this.LastName = name;
    }

    public Sex getSex()
    {
        return sex;
    }

    public void setSex(Sex sex)
    {
        this.sex = sex;
    }

    public LocalDate getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate)
    {
        this.birthdate = birthdate;
    }
}
