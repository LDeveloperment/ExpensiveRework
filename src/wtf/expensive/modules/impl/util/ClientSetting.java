package wtf.expensive.modules.impl.util;

import wtf.expensive.events.Event;
import wtf.expensive.modules.Function;
import wtf.expensive.modules.FunctionAnnotation;
import wtf.expensive.modules.Type;
import wtf.expensive.modules.settings.imp.BooleanOption;
import wtf.expensive.modules.settings.imp.ModeSetting;

@FunctionAnnotation(name = "ClientSettings",type = Type.Util)
public class ClientSetting extends Function {
    public ModeSetting sprint = new ModeSetting("����� �������","��������","��������","�����");
    public BooleanOption fixinteract = new BooleanOption("���������� ������",false);
    public ClientSetting() {
        addSettings(sprint, fixinteract);
    }
    @Override
    public void onEvent(Event event) {

    }
}
