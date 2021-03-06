package ai.cbz.inbound.common.enums;

/**
 * @Author: Jinzw
 * @Date: 2020/11/5 15:26
 */
public enum DialogActionTypeEnum {
    DM_AA_CHAT_REFUSE(20000),
    DM_AA_CHAT_PRE_ANSWER(20001),
    DM_AA_CHAT_ANSWER(20002),
    DM_AA_CHAT_PLAY_FILE(20003),
    DM_AA_CHAT_PLAY_TTS(20004),
    DM_AA_CHAT_TRANSFER(20005),
    DM_AA_CHAT_PAUSE_PLAY(20006),
    DM_AA_CHAT_DETECT_SPEECH(20007),
    DM_AA_CHAT_GET_DTMF(20008),
    DM_AA_CHAT_HANGUP(20009),
    DM_AA_CHAT_WAIT(20010);

    private final int type;

    DialogActionTypeEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
