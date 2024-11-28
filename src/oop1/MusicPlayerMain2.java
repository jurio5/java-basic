package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayaerData data = new MusicPlayaerData();

        // 음악 플레이어 상태 전환
        Musicinit(data,0);

        // 볼륨 증가
        VolumeControl(data, 1);

        //볼륨 증가
        VolumeControl(data, 1);

        // 볼륨 감소
        VolumeControl(data, 0);

        // 음악 플레이어 상태
        MusicStatus(data);
    }

    public static void MusicStatus(MusicPlayaerData data) {
        if (data.isOn) {
            System.out.println("음악 플레이어 ON , 현재 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    public static void Musicinit(MusicPlayaerData data, int state) {
        if (state == 0) {
            data.isOn = false;
            System.out.println("음악 플레이어를 종료합니다.");
        } else if (state == 1) {
            data.isOn = true;
            System.out.println("음악 플레이어를 시작합니다.");
        } else {
            System.out.println("""
        정확한 커맨드를 입력해주세요.
        0 = OFF
        1 = ON
        """);
        }
    }

    public static void VolumeControl(MusicPlayaerData data , int volume) {
        if (volume == 1) {
            data.volume++;
            System.out.println("볼륨이 증가하였습니다. 현재 볼륨 : " + data.volume);
        } else if (volume == 0) {
            if (data.volume > 0) {
                data.volume--;
                System.out.println("볼륨이 감소하였습니다. 현재 볼륨 : " + data.volume);
            } else {
                System.out.println("현재 볼륨은 이미 0 입니다.");
            }
            } else {
                System.out.println("볼륨 Up = 1 \n볼륨 Down = 0");
            }
    }
}
