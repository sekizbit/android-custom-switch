# android-custom-switch
Android Switch component with made by 2 Buttons and LinearLayout. For those who wants to show "off text" also.

Deafult android switch does not have an option to show unselected button's text. 

## usage

1. Copy XML files under res/drawable to your project's res/drawable folder.
2. Copy LinearLayout from layout.xml to your layout file.
3. Copy values from values/colors.xml and values/dimens to your own files.
4. Initilize the switch with following code
```
SekizbitSwitch mySwitch = new SekizbitSwitch(findViewById(R.id.sekizbit_switch));
        mySwitch.setOnChangeListener(new SekizbitSwitch.OnSelectedChangeListener() {
            @Override
            public void OnSelectedChange(SekizbitSwitch sender) {
                if(sender.getCheckedIndex() ==0 )
                {
					System.out.println("Left Button Selected");
                }
                else if(sender.getCheckedIndex() ==1 )
                {
                    System.out.println("Right Button Selected");
                }
            }
        });
```
## customization
* You can change the colors and padding on colors.xml and dimens.xml
* Switch only contains 2 buttons, if you need more customization just customize them as  standart button.
