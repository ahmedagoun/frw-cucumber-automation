Feature: Je me registre sur le site
  En tant que utilisateur je souhaite m enregistrer sur le site Register

  @register
  Scenario: Je me registre sur le site
    Given Je me connecte sur l application Register
    When Je rempli le champ First Name "Ahmed"
    And Je rempli le champ Last Name "Agoun"
    And Je rempli le champ Phone "53 680 809"
    And Je rempli le champ Email "ahmed.elagoun@gmail.com"
    And Je rempli le champ Address "rue ibn rachik"
    And Je rempli le champ City "Bizerte"
    And Je rempli le champ State "Bizerte Nord"
    And Je rempli le champ Postal Code "7000"
    And Je rempli le champ Country "TUNISIA"
    And Je rempli le champ User Name "Ahmed"
    And Je rempli le champ Password "12345"
    And Je rempli le champ Confirm Password "12345"
    And Je clique sur le bouton Envoyer
    Then Je me redirige vers la page "https://demo.guru99.com/test/newtours/register_sucess.php"
