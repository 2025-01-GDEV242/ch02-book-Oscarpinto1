/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    public int pages;
    public String refNumber;
    public int borrowed;
    private boolean courseText;
    
    

    /**
     * Set the author,title, pages,ref number and if it is 
     * a course text book, fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages,
    boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages= bookPages;
        refNumber= ("");
        courseText= isCourseText;
        
        
        
        
    }
    


    // Add the methods here ...
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
       return borrowed;
    }
    
    public boolean isCourseText()
    
    {
        return courseText;
    }
    
    
    
    public void setRefNumber(String ref)
    
    {
        if(ref.length() >= 3)
        {
        refNumber= ref;
    }
    else
    {
        System.out.println("Reference number must be at least 3 characters");
    }
}

    public void borrow()
    {
        borrowed= borrowed +1;
        
    }
    
    public void printAuthor()
    {
     System.out.print(author);
    }

    public void printTitle()
    {
        System.out.print(title);
    }
    
    public void printDetails()
    {
        System.out.print(" Title: " + title + "\n Author: "+ author + 
        "\n Pages: " + pages);
        
        if( refNumber.length() > 0)
        {
            System.out.println("\n Reference Number: " + refNumber);
        }
            
            else
            {
                System.out.println(" ZZZ");
            }
        if (borrowed==1)
        {
        System.out.println("The book: " + title + " has been borrowed "
        + borrowed + " time");    
        }
        else
        {
            System.out.println("The book: " + title + " has been borrowed "
        + borrowed + " times");   
        
        }
    }
    
    
    
    
    
    
}


