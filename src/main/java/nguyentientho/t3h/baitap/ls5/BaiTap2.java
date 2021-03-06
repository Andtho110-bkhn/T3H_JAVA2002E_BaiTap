package nguyentientho.t3h.baitap.ls5;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: T3H_JAVA2002E_BaiTap
 * @author: Nguyễn Tiến Thọ
 */
public class BaiTap2 {
    public static void main(String[] args) {
        var menuLinhVuc = new Menu(10, "Lĩnh Vực", 0);
        var menuNhaHang = new Menu(11, "Nhà Hàng", 10);
        var menuKinhDoanh = new Menu(12, "Kinh Doanh", 10);
        var menuDuLich = new Menu(12, "Du Lịch", 10);

        var menuTinTuc = new Menu(20, "Tin Tức", 0);
        var menuKyThuatIn = new Menu(24, "Tin Tức", 20);
        var menuDoHoa = new Menu(24, "Đồ Họa", 20);
        var menuMyThuat = new Menu(25, "Mỹ Thuật", 20);

        var listMenus = new ArrayList<Menu>();
        listMenus.add(menuLinhVuc);
        listMenus.add(menuNhaHang);
        listMenus.add(menuKinhDoanh);
        listMenus.add(menuDuLich);

        listMenus.add(menuTinTuc);
        listMenus.add(menuKyThuatIn);
        listMenus.add(menuDoHoa);
        listMenus.add(menuMyThuat);

//        arrayDataMenuWithIndent(listMenus, 0, "");

        var listMenu = arrayDataMenuWithIndent(listMenus, 0, "");
        for(Menu mn : listMenu) {
            System.out.println("menu name: " + mn.name);
        }
    }

    public static ArrayList<Menu> menuWithIndent = new ArrayList<Menu>();
    public static List<Menu> arrayDataMenuWithIndent(ArrayList<Menu> lists, int parentId, String indent) {
        for (Menu menu : lists) {
            Menu menuTmp = new Menu();
            if (menu.parentId != parentId) {
                continue;
            }
            menuTmp.id = menu.id;
            menuTmp.name = indent + menu.name;
            menuTmp.parentId = menu.parentId;
            menuWithIndent.add(menuTmp);

            arrayDataMenuWithIndent(lists, menu.id, "--");
        }
        return menuWithIndent;
    }
}
