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
    Then Insert code on "FL" registration page
    Then Click "Проверить код" button checkCode
    Then Content with "Код подтверждён" visible
    Then Click "Зарегистрироваться" button reg
    Then lk "Submit" button span
    Then Content with "Вы всегда можете позвонить нам и узнать нужную информацию" visible
    Then Del user

  @Registration
  Scenario: Create user UL
    Then Open "registration" page
    Then Input email
    Then Input Last Name
    Then Input Phone Number
    Then Input First Name
    Then Click "Go" buttonb spanb
    Then Click "UL" button spanUL
    Then Input companyName
    Then Input companyINN
    Then Click "Next" buttonn spann
    Then Click "Region" but
#    Then Select "Республика Марий Эл" but
    Then Click "Gorod" butt
    Then Input city: "Барнаул"
    Then Input ulica: "Мира"
    Then Input Dom: "123"
    Then Click "Совпадает с ЮА" buton ua
    Then Click "Next" buttonn spann
    Then Input Bank Name: "Сбер"
    Then Input RCH
    Then Input BIK
    Then Innput CCH
    Then Click "Next" br button
    Then Click "Отправить код" button getCode ul
    Then Insert code on "UL" registration page
    Then Click "Проверить код" button checkCode ul
    Then Content with "Код подтверждён" visible
    Then Click "Зарегистрироваться" button reg ul
    Then lk "Submit" button span
    Then Content with "Вы всегда можете позвонить нам и узнать нужную информацию" visible
    Then Del user
