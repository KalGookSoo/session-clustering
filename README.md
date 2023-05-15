# session-clustering

## Getting started
아래 두 URL을 요청하여 SESSIONID를 확인한다.
http://localhost:8081/session
http://localhost:8080/session

현재 Hazelcast를 활용한 스프링세션(인메모리 방식)을 사용했다.
추후 Redis, SecurityContextHolder(AuthenticationPrincipal, JWT) 추가 예정