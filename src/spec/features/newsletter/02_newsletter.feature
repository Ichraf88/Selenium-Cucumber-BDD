#langage: EN
@newsletter
Feature: Je Souhaite Tester la souscription aux newsletter

Scenario: Je Souhaite Tester la souscription avec un email valide 

Given J'accede au site Web Demo Shop
When Je saisis une adresse mail valide
And  clique sur Subscribe
Then le message suivant doit apparaitre "Thank you for signing up! A verification email has been sent. We appreciate your interest."
