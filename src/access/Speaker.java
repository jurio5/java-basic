package access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량 입니다.");
        } else {
            this.volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("음량은 0 이하로 내려갈 수 없습니다.");
        } else {
            volume -= 10;
            System.out.println("음량이 10 감소합니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
