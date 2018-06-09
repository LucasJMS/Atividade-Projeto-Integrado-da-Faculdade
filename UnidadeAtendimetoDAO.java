import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UnidadeAtendimentoDAO {
	public void inserirUnidadeAtendimento(UnidadeAtenidmento ua) throws SQLException {
        String sql = "INSERT INTO unidade_atendimento VALUES (?, ?, ?, ?)";
		try(Connection con = ConnectionFactory.getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, p.getCodigo());
			ps.setString(2, p.getNome());
			ps.setString(3, p.getEndereco());
			ps.setString(4, p.getTelefone());
			ps.execute();
        }

	public List<UnidadeAtendimento> buscarUnidadeAtendimento() throws SQLException {
		List<UnidadeAtendimento> lista = new ArrayList<>();
		String sql = "SELECT * from unidade_atendimento";
		Connection con = ConnectionFactory.getConnection();
		try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery();) {
			while (rs.next()) {
				UnidadeAtendimento ua = new UnidadeAtendimento();
				ua.setCodigo(ua.getInt("codigo"));
				ua.setNome(ua.getString("nome"));
				ua.setNome(ua.getString("endereco"));
				ua.setNome(ua.getString("telefone"));
				lista.add(ua);
			}
		}
		return lista;
	}


	public void atualizarUnidadeAtendimento(UnidadeAtenidmento ua) throws SQLException {
        String sql = "UPDATE unidade_atendimento SET nome = ?, endereco = ?, telefone = ? WHERE codigo = ?";
		try (Connection con = ConnectionFactory.getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, ua.getNome());
			ps.setEndereco(2, ua.getEndereco());
			ps.setTelefone(3, ua.getTelefone());
			ps.setInt(4, ua.getCodigo());
			ps.executeUpdate();
        }
    }


	public void deletarUnidadeAtendimento(int codigo) throws SQLException {
        String sql = "DELETE FROM unidade_atendimento WHERE codigo = ?";
		try (Connection con = ConnectionFactory.getConnection(); PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1, codigo);
			ps.executeUpdate();
        }
    }

}
