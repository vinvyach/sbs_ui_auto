Feature: Login User

  @MainPagePopUp
  Scenario: Login user
    Then Click "Sign in" button
    Then Input login
    Then Input password
    Then Click "Submit" button span
    Then lk "Submit" button span
    Then Content with "Вы всегда можете позвонить нам и узнать нужную информацию" visible

  @Registration
  Scenario: Create user
    Then Open "registration" page
    Then Input email
    Then Input Last Name
    Then Input Phone Number
    Then Input First Name
    Then Click "Go" buttonb spanb
    Then Click "Отправить код" button getCode
    Then Insert code
    Then Click "Проверить код" button checkCode
    Then Content with "Код подтверждён" visible
    Then Click "Зарегистрироваться" button reg
    Then lk "Submit" button span
    Then Content with "Вы всегда можете позвонить нам и узнать нужную информацию" visible