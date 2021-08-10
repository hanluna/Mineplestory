MINEPLESTORY, Minecraft rpg mod.
=============

**This mod was developed by the SWChat Group and all privileges are in SWChat.**

`Copyright 2021. SWChat all rights reserved.`

개발 양식입니다. 

클래스 이름은 직업무기이름 입니다. ex) WarriorBloodySword -> 단어의 시작은 대문자입니다.
무기의 아이디는 소문자와 언더바를 사용합니다. 이하는 위와 같습니다. warrior_bloodysword




**엔티티 추가 방식입니다.**
====================

 `EntityName은 자신의 엔티티 이름입니다.`
 
 `따로 언급이 없으면, 같은 패키지내의 다른 클래스파일을 복사 붙혀넣기하는것이 좋습니다.`
 
 `복사 붙혀넣기 할 경우, 그 복사 붙혀넣기 한 클래스의 이름과 관련된건 전부 바꿔주는것이 가장 성공확률이 높습니다.`
 
 `엔티티 추가 시 필요한 것들 입니다. - .png파일, .png파일을 변환한 .java파일`

1. entity 패키지에 EntityEntityName을 생성합니다.

2. entity - model 패키지에 png파일을 모델로 변환한 java파일을 넣습니다. 이름을 ModelEntityName으로 하면 자동으로 내부 변수들의 이름도 변환됩니다.

3. render 패키지에 RenderEntityName을 생성합니다. 

4. init - Entities 패키지를 열어서, registerEntity()를 추가합니다. 위치는 registerEntity()들이 모여있는 곳 입니다. 

5. util - handlers - RenderHandler를 열어서, RenderingRegistry ~ }); 까지 복사한 후, 자신의 엔티티이름에 맞게 변수들을 바꿔줍니다.

6. Reference를 열어서, ENTITY_ENTITYNAME을 입력합니다. 숫자는 곧 ID입니다.

7. Resource - assets - mineplestory - textures - entity에 png 파일을 추가합니다.

8. 마지막으로, x쳐져있는 클래스에 들어가 ctrl + shift + o로 필요한 파일들을 임포트 합니다.



**검재료 추가 방식입니다.**
====================

1. init - items를 열어서, ToolMaterial 밑에 같은 양식으로 추가해주면 됩니다. 인자는 주석처리했습니다.




**검 추가 방식입니다.**
====================

`SwordName은 자신의 검 이름입니다.`

1. Items 패키지를 열어서 SwordName을 생성합니다.

2. init - Items를 열어서 검과 도구 재료를 생성합니다. 

검 관련한 인자 설명입니다.

`SwordName('검id', 재료)`

도구 재료 관련한 인자 설명입니다.

`EnumHelper.addToolMaterial('도구ID', 수확 레벨(나무부터 다이아까지 0~3입니다.), 사용 횟수, 효율, 데미지(나무부터 다이아까지 0~3입니다.), 인챈트 효율`

3. resources - textures - items 에 .png 파일을 저장합니다.

4. resources - models - item에 .json 파일을 저장합니다. 나머지 json파일을 참고합니다.

5. resources - models - itemk에 .json 파일을 저장합니다. 나머지 json파일을 참고합니다.
















