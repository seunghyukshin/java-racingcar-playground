## 기능목록

### 입력
- [ ] 자동차 이름 ","를 기준으로 구분
- [x] 자동차의 이름 길이 = 최대 5글자 
- [ ] 반복횟수 입력받기

### 실행
- [ ] 0~9 랜덤한수 생성 `RandomUtils.generateSinglPositiveNumber(`
- [x] 4보다 크다면 전진 `Car.position ++`
- [x] 가장 큰 position 가진 Car 목록 추출 

### 출력
- [ ] 전진시 자동차 "${자동차이름}: (-*)" 출력
- [ ] 경주 완료 후 우승자 목록 Name 출력

### 고민
- cars vs carList naming
- WinnerCars extends Cars 만들다가 막혔다. 
  - 생성자를 어떻게 만들어줘야할까
  - WinnerCars(Cars cars) 로하면 Cars에서 
  - WinnerCars(CarList<Car>) 로하면 RacingGame에서 생성할 수 없다
- Car.getPosition() 안만들고 우승자 가려낼 방법은 없나
- Cars에서 equals 비교가 안된다. List때문에...