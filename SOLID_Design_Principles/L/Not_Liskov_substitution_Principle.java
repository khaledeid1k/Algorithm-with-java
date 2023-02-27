package SOLID_Design_Principles.L;

public class Not_Liskov_substitution_Principle {
public abstract class SocialMedia {
    
    public abstract  void chatWithFriend();
    
    public abstract void publishPost(Object post);
    
    public abstract  void sendPhotosAndVideos();
    
    public abstract  void groupVideoCall(String... users);
}
/*Social media can have multiple implantation or can have multiple 
child like Facebook, WhatsApp ,instagram and Twitter etc..
*/

//now let’s assume Facebook want to use this features or functionality .


public class Facebook extends SocialMedia {
    public void chatWithFriend() {
        //logic  
    }

    public void publishPost(Object post) {
        //logic  
    }

    public void sendPhotosAndVideos() {
        //logic  
    }

    public void groupVideoCall(String... users) {
        //logic  
    }
}
/* 
In 20th century I believe everyone using this 
Facebook APP and all the above mention features available in
 Facebook so here we can consider Facebook is complete substitute of
  SocialMedia class , both can be replaced without any interrupt .
*/

// Now let’s discuss WhatsApp class
public class WhatsApp extends SocialMedia {
    public void chatWithFriend() {
        //logic
    }

    public void publishPost(Object post) {
      //Not Applicable
    }

    public void sendPhotosAndVideos() {
      //logic
    }

    public void groupVideoCall(String... users) {
        //logic
    }
}

//due to publishPost() method whatsapp child is not substitute of parents SocialMedia
}
