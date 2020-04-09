Feature: Register account at forum
  Scenario Outline: Show success message when register account is successful
    Given The register screens is showed
    When The user input data with <username>, <email>, <pass>, <gender>,<month>, <day>, <year>, <location>, <confirm> and submit form
    Then The message "Cảm ơn bạn đã đăng ký. Để hoàn thành đăng ký, bạn phải vào hộp mail kích hoạt đường link mà diễn đàn gửi cho bạn"  will be showed
    Examples:
      |username	 |email				  |pass		  |gender |month|day|year   |location	|confirm		          |
      |"tester12"|"tester12@gmail.com"|"12345Aa@" |"0"	  |"1"	|"1"|"2000" |"Hà Nội"	|"FORUM.VIETDESIGNER.NET" |




