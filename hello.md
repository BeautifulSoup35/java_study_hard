일반적 작성
# 제목 크기
## 제목 2 크기
### 제목 3크기

__이렇게 작성하면__ 볼드체가 적용
지금 사용하는게 markdown languge 라고 합니다

.md파일로 이뤄지는것

1. odrded list
2. 엔터치면 자동 2
3. 새로 생김
4. 이게 생긱는게 불편하다면
엔터 두 번 치면 list 해제

- unordered list
- 알아서 생기는
  - 텝 가능
    - 두번도 가능

1. 여기도 
   2.   탭 가능 ii로 나온다
      3. 탭 두번 가능

갤서 google에서
markdown 혹은 노션 문법 검색하면
필요한 정보들은 얻을 수 있다

이것을github에서도 .md 파일을
자동으로 읽어준다

그래서 githud repository 에서

해당 프로젝트에 대한 버전 설명
혹은 프로젝트에 대한 개요
등에 대한 설명을 할때
README.md 형태로 작성해서 소개한다

실제 프로젝트를 진행한것이 아니니
git add로만 한것

추후에 개인 프로젝트 진행할때에는 
    READEME 활용하기

```java
int a =1;
int b = 2;
System.out.print(a+b);


```
코드블록 작성하는 방법도 가능한데

얘의 장점은

저희가 지금 class를 배운 후 부터는
파일을 넘나들며 수업이 진행되는데

그래서 발생하는 문제인 코드를 한눈에 읽는게 어려워짐

여기 코드블록들 다 모아놓고
한큐에 보는 방식으로 공부하기도 한다

깃허브에 새로  push 할때에
코드 블럭이나 파일의 변화가 있어야 올릴 수 있다

git add .
git commit -m "feat: 20250212 markdown lesson"
git push

git add .
git commit -m "feat: 20250217 abstract class lesson staarted"
git push
git commit -m "faet: 20250219 casting started"

git add .
git commit -m "feat: 20250220 Object Class"
git push
