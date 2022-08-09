@CertificateTest
Feature: Test https://certificate.ithillel.ua/

  Scenario Outline:
    When I open site "https://certificate.ithillel.ua/"
    And Enter certificate number "<Certificate>"
    And Wait 3000
    Then Check result
    Examples:
      | Certificate |
      | 12345       |
      | 1234567     |
      | 1234567789  |
      | 12345678900 |