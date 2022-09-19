@CertificateTest

Feature: Test https://certificate.ithillel.ua/

  Scenario Outline:
    When I open site "https://certificate.ithillel.ua/"
    And Enter certificate code <Certificate>
    Then Check result
    Examples:
      | Certificate |
      | 12345       |
      | 234567      |
      | 123456789   |
      | 78008248    |

