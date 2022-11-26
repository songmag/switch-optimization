
Enum을 활용한 If, Case 의 단축
---

Java 의 Enum 의 경우, ordinal 이 무조건적으로 들어가게 된다

if, switch 문을 통해 하는 방법 또한 명확하고, 수정이 자유롭다는 장점이 있다.

switch 문을 사용하게 되면 LineNumberTable 을 생성하는 최적화를 거치는 것을 확인했다

Build 하게되면 EnumTableNotUsed에 inner class 가 없는데, 최적화를 거쳐 inner class가 만들어진다

이건 좀 신기하여 테스트코드를 올려놓는다.

