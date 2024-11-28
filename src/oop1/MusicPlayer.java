package oop1;

public class MusicPlayer {
    private int volume; // 속성 (멤버 변수)
    private boolean isOn;

    void on() { // 기능 (메서드)
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        if (!(volume >= 100)) {
            volume++;
            System.out.println("음악 플레이어 볼륨 : " + volume);
        } else {
            System.out.println("이미 최대 볼륨 입니다.");
        }
    }

    void volumeDown() {
        if (!(volume <= 0)) {
            volume--;
            System.out.println("음악 플레이어 볼륨 : " + volume);
        } else {
            System.out.println("볼륨이 0 미만으로 내려갈 수 없습니다.");
        }
    }

    void showStatus() {
        if (isOn) {
            System.out.println("음악 플레이어가 켜져있습니다.");
        } else {
            System.out.println("음악 플레이어가 종료되어 있습니다.");
        }
    }
}
