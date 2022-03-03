Feature: LoginProductBasket

  Scenario: LoginBasketProductSuccess
    Given Hover myAccount
    When  Click login
    And   Fill email "hbcasestudy@gmail.com"
    And   Click btnLogin
    And   Fill password "Hb123456."
    And   Click btnEmailSelect
    Then  Should see //div[@id="myAccount"]//span//span[1] element text equal to Hesabım
    And   Click .desktopOldAutosuggestTheme-container
    And   Fill product Lipton Yellow Label Bardak Poşet Çay 100'lü 03112401
    And   Click .SearchBoxOld-buttonContainer
    And   Click i0
    And   Switch to newtab
    And   Click addToCart
    And   Click .checkoutui-voltran-body> div > div > div > div > div > h1 > a
    And   Click //html/body/div[2]/main/div[3]/section[1]/div[4]/div/div[4]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[3]/div/form/button
    And   Click .checkoutui-voltran-body> div > div > div > div > div > h1 > a
    And   Click shoppingCart
    Then  Should see .basket_item_1rDra > div > div > div.product_item_wfDPt > div.product_properties_2hkip > div.product_name_3Lh3t > a element text equal to Lipton Yellow Label Bardak Poşet Çay 50 Adet 100 gr
    And   Click .delete_all_2uTds
    And   Click .red_3m-Kl
    Then  Should see //*[@id="app"]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/h1 element text equal to Sepetin şu an boş






