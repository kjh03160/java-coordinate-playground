## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

## 기능 요구사항
### 1. 좌표 계산기 (선 길이)

- [X] 사용자가 두 점의 좌표를 입력할 수 있다.
- [X] 두 점을 입력하지 않으면 에러 문구를 출력한다.
- [X] 두 점은 괄호로 둘러싸여있고, -로 구분한다.
- [X] x, y는 쉽표로 구분한다.
- [X] x, y는 0 이상 최대 24까지만 입력할 수 있다.
  - [X] 입력 범위를 초과하면 에러 문구를 출력한다
  - [X] 이후 다시 입력을 받는다.
- [X] 두 점의 좌표를 생성한다.
- [ ] 좌표에 특수 문자를 표시한다
- [X] 두 점 직선의 거리를 계산한다.
- [X] 거리를 출력한다.

### 2. 좌표 계산기 (사각형 면적)
- [X] 사용자가 4개의 좌표를 입력할 수 있다.
- [X] 직사각형의 좌표만 허용한다.
- [X] 사각형의 넓이를 계산한다.
- [X] 결과를 출력한다.


