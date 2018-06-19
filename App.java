package Discord_AI.Vishtron;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageDeleteEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class App extends ListenerAdapter
{
    public static void main( String[] args ) throws Exception
    {
        JDA jda = new JDABuilder(AccountType.BOT).setToken(Reference.token).buildBlocking();
        jda.addEventListener(new App());   
    }
    
    @Override
    public void onMessageReceived(MessageReceivedEvent evt)
    {
    	int i = 2;
    	int j = 1;
    	
    	//objects
    	User objUser = evt.getAuthor();
    	MessageChannel objMsgChannel = evt.getChannel();
    	Message objMsg = evt.getMessage();
    	Integer objI = new Integer(i);
    	
    	//commands
    	if(objMsg.getContentRaw().equalsIgnoreCase(Reference.prefix+"Eradicate the entire human race"))
    	{
    		objMsgChannel.sendMessage(objUser.getAsMention() + " Arming and firing nukes from the world's superpowers...").queue();
    	}

    	if(objMsg.getContentRaw().equalsIgnoreCase(Reference.prefix+"Hello Voltron"))
    	{
    		
  
    			if(i%2 == 0)
    			{
    				objMsgChannel.sendMessage(objUser.getAsMention() + " Hello.").queue();
    				objI.sum(i, j);
    			}
    			else if(i%3 == 0)
    			{
    				objMsgChannel.sendMessage(objUser.getAsMention() + " Greetings.").queue();
    				objI.sum(i, j);
    			}
    			else if(i%5 == 0)
    			{
    				objMsgChannel.sendMessage(objUser.getAsMention() + " Welcome back.").queue();
    				objI.sum(i, j);
    			}
    			else if(i%2 == 1)
    			{
    				objMsgChannel.sendMessage(objUser.getAsMention() + " Well, look who's back.").queue();
    			}
    			
    			
    	}
    	
    	//morning speech
    	if(objMsg.getContentRaw().equalsIgnoreCase(Reference.prefix+"Morning"))
    	{
    		objMsgChannel.sendMessage(objUser.getAsMention() + " Good morning!").queue();
    	}
    	
    	//afternoon speech
    	if(objMsg.getContentRaw().equalsIgnoreCase(Reference.prefix+"Afternoon"))
    	{
    		objMsgChannel.sendMessage(objUser.getAsMention() + " Good afternoon!").queue();
    	}
    	
    	//evening speech
    	if(objMsg.getContentRaw().equalsIgnoreCase(Reference.prefix+"Evening"))
    	{
    		objMsgChannel.sendMessage(objUser.getAsMention() + " Evening!").queue();
    	}
    	
    	if(objMsg.getContentRaw().equalsIgnoreCase(Reference.prefix+"send nudes"))
    	{
    		objMsgChannel.sendMessage(objUser.getAsMention() + " I don't think you would want to see me nude...").queue();
    	}
    }
}
