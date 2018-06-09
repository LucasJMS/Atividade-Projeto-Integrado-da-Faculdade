
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog);
					("0 - Sair\n1 - Cadastrar\n2 - Consultar\n3 - Atualizar\n4 - Deletar"));
			switch (op) {
				case 1:
					try {
						int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: "));
						String nome = JOptionPane.showInputDialog("Digite o nome: ");
						String nome = JOptionPane.showInputDialog("Digite o endereco: ");
						String nome = JOptionPane.showInputDialog("Digite o telefoe");
						UnidadeAtendimento ua = new UnidadeAtendimento (codigo, nome, endereco, telefone);
						UnidadeAtendimentoDAO uaDAO = new UnidadeAtendimentoDAO();
						uaDAO.inserirUnidadeAtendimento(ua);
						JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
					}
					catch (SQLException e) {
						JOptionPane.showMessageDialog(null, "Falha na Inserção");
					}
					catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Presta atenção na digitação");
					}
					break;
				case 2:
					try {
						List<UnidadeAtendimento> lista = new UnidadeAtendimentoDAO().buscarUnidadeAtendimento();
						for (UnidadeAtendimento ua: lista) {
							JOptionPane.showMessageDialog(null, ua);
						}
					}
					catch (SQLException e){
						JOptionPane.showMessageDialog(null, "Falha na busca");
					}
					break;
                case 3:
                    try {
                        String nome = JOptionPane.showInputDialog("Digite o novo nome: ");
						String nome = JOptionPane.showInputDialog("Digite o novo endereco: ");
						String nome = JOptionPane.showInputDialog("Digite o novo telefone");
						int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da Unidade que sera atualizada: "));

						//UnidadeAtendimento ua = new UnidadeAtendimento();

						UnidadeAtendimentoDAO uaDAO = new UnidadeAtendimentoDAO();
						uaDAO.atualizarUnidadeAtendimento(ua);
						JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
                    }
                    catch (SQLException e) {
						JOptionPane.showMessageDialog(null, "Falha na Atualização");
					}
					catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Presta atenção na digitação");
					}
					break;
                case 4:
                    try {
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da Unidade que sera deletada: "));
                        new UnidadeAtendimentoDAO[].deletarUnidadeAtendimento(id);
                    }
                    break;
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
			}
		} while (op != 0);

	}

}
