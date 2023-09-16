package com.ajaz.playerbotinheritance;

import com.ajaz.playerbotinheritance.joinedtable.Mentor;
import com.ajaz.playerbotinheritance.joinedtable.MentorRepository;
import com.ajaz.playerbotinheritance.joinedtable.User;
import com.ajaz.playerbotinheritance.joinedtable.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerBotInheritanceApplication implements CommandLineRunner {

    private MentorRepository mentorRepository;
    private UserRepository userRepository;
    public PlayerBotInheritanceApplication(@Qualifier("jt_mr") MentorRepository mentorRepository,
                                           @Qualifier("jt_ur") UserRepository userRepository){
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Mentor mentor = new Mentor();
        mentor.setName("Ajaz");
        mentor.setEmail("ahmed786ajaz@g.com");
        mentor.setAverageRating(89.70);

        mentorRepository.save(mentor);

        User user = new User();
        user.setName("Rashida");
        user.setEmail("rashida786ahmed@g.com");

        userRepository.save(user);

    }

    public static void main(String[] args) {
        SpringApplication.run(PlayerBotInheritanceApplication.class, args);
    }

}
