package SOLID_Design_Principles.L;

public class Liskov_substitution_Principle {
    public interface SocialMedia {  
        public void chatWithFriend();
        public void sendPhotosAndVideos();
     }
     public interface SocialPostAndMediaManager { 
        public void publishPost(Object post);
    }
    public interface VideoCallManager{ 
       public void groupVideoCall(String... users);
    }

    /*
     * now its up to implementation class decision to support features ,
     *  based on their desired feature they can use respective interface for
     *  example instagram doesn’t support video call feature so instagram 
     * implementation can be design something like this
     */
    public class Instagram implements SocialMedia ,SocialPostAndMediaManager{
        public void chatWithFriend(){
            //logic
           }
           public void sendPhotosAndVideos(){
            //logic
           }
           public void publishPost(Object post){
            //logic
           }
        }
}
