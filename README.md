## 기능목록

1. 입력
- [v] 쉽표를 구분자로 자동차 이름 파싱
- [ ] 자동차 이름 5글자 초과시 Exception
- [ ] 반복횟수 입력받기

2. 실행
- [v] 각 자동차는 1전진 당 랜덤한 수를 갖는다
- [v] 랜덤한 수가 4 이상일 경우 전진한다.


3. 출력
- [ ] 매번 움직일때마다 자동차 이름 출력
- [ ] 전진한 수의 갯수 만큼 '-'(hypen) 출력
- [ ] 반복이 끝나면 가장 많이 움직인 자동차 이름 출력


## 고민
1. Race 생성자의 파라미터는 뭐가 좋을까? (List<Car>)
2. Test를 위한 코드가 오히려 더 더럽힌다.
3. View 클래스는 Race안에서 호출해야할까? (View에서 Race가 좋아보임)
   아니면 View에서 Race를 호출해야할까? 

4. 반복문 돌리는김에 출력도 같이 넣을까?
   아니면 전진시키는 반복문 따로, 출력 따로
- 전자
```java
// N바퀴
 public void turnOn(int N) {
     for (int n = 0; n < N; n++) {
         _turnOn();
         System.out.println();
     }
 }
 
 /***
  *한 바퀴 돌때
  * 1. Car 전진
  * 2. Car상태 출력
  * 3.
  */
 private void _turnOn() {
     carList.forEach(car -> {
         car.drive();
         ResultView.printStatus(car);
     });

     System.out.println();
 }
```
