Feature: Login with forum
  #Scenario: Show notify message after login with forum account that do not confirm from email
    #Given The login screen is showed
    #When The user try to login with "tester123" and "12345Aa@"
    #Then The message "Tài khoản của bạn hiện đang chờ xác nhận. Link xác nhận đã được gửi đến email của bạn là: tester123@gmail.com. Hãy vào email để kiểm tra và ấn vào link xác nhận tài khoản nhé." will be showed

  Scenario: Show home screen after login with forum account
    Given The login screen is showed
    When The user try to login with "tester123" and "12345Aa@"
    Then The home screen will be showed

