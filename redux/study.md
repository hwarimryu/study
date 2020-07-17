store의 state를 변경하려면,
1. 새로운 state 객체 action 생성
2. dispatch로 reducer를 호출하면서 현재 state값과 action을 전달한다. <br>
 action의 필수 값으로 type:''을 정해줘야함!
3. reducer에서 전달받은 action의 type에 맞춰서 acrion,state를 이용해 새로운 newState 객체를 만들어 return한다.
4. render를 store에 subscribe 해두면 변경된 state가 화면에 자동으로 반영된다.