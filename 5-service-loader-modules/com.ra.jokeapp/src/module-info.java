import com.ra.jokeserver.JokeServer;

module com.ra.jokeapp {
    requires com.ra.jokeserver;
   // requires com.ra.jokeserver.programmer;
   // requires com.ra.jokeserver.kid;
    uses JokeServer;

}