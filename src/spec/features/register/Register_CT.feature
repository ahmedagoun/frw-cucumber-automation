Feature: Verifier le module registrer
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @module_registre
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Register
    When Je rempli le champ First Name "<firstname>"
    And Je rempli le champ Last Name "<lastname>"
    And Je rempli le champ Phone "<phone>"
    And Je rempli le champ Email "<email>"
    And Je rempli le champ Address "<adress>"
    And Je rempli le champ City "<city>"
    And Je rempli le champ State "<state>"
    And Je rempli le champ Postal Code "<postalcode>"
    And Je rempli le champ Country "<country>"
    And Je rempli le champ User Name "<username>"
    And Je rempli le champ Password "<password>"
    And Je rempli le champ Confirm Password "<confirmpassword>"
    And Je clique sur le bouton Envoyer
    Then Je me redirige vers la page "Note: Your user name is Ahmed."

    Examples: 
      | firstname | lastname | phone |email | adress |city | state |postalcode |country|username| password| confirmpassword |
      | Ahmed    | Agoun    |53 680 809|ahmed.elagoun@gmail.com | rue ibn rachik |Bizerte |Bizerte Nord |7000 |TUNISIA |Ahmed| 12345| 12345|
      | Honza    | Baratli  |98 605 997 |honza.baratli@gmail.com | rue ibn batouta | Bizerte 1 | Bizerte Nord 1 |7003 |TUNISIA |Bechir|56789|56789|