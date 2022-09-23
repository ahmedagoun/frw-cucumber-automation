
Feature: Je verifie la page de la connexion
  En tant que utilisateur je souhaite me connecter au site mercury

  @connexion
  Scenario: Je verifie la page de la connexion
    Given Je me connecte sur le site Mercury
    When Je sais le user name "test"
    And Je sais le mot de passe "test"
    And Je clique sur le bouton subbmit
    Then Je me redirige vers la page home "Login Successfully"
