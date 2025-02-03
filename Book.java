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
    

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, int borrowed)
    {
        author = bookAuthor;
        title = bookTitle;
        pages= bookPages;
        refNumber= ("");
        
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
        System.out.print("Title: " + title + "Author: "+ author + "Pages: " + pages);
        
        if( refNumber.length() > 0)
        {
            System.out.println("Reference Number: " + refNumber);
        }
            
            else
            {
                System.out.println("ZZZ");
            }
        }
    
    
    
    
    
    
}


